package ru.kotov.customer;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.kotov.clients.fraud.FraudCheckResponse;
import ru.kotov.clients.fraud.FraudClient;
import ru.kotov.clients.notification.NotificationClient;
import ru.kotov.clients.notification.NotificationRequest;

@Service
@AllArgsConstructor
public class CustomerService {
    private final CustomerRepository customerRepository;
    private final FraudClient fraudClient;
    private final NotificationClient notificationClient;

    public void registerCustomer(CustomerRegistrationRequest request) {
        Customer customer = Customer.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .build();
        customerRepository.saveAndFlush(customer);

        FraudCheckResponse fraudCheckResponse = fraudClient.isFraudster(customer.getId()) ;
        if(fraudCheckResponse.isFraudster()) {
            throw new IllegalStateException("fraudster");
        }
        notificationClient.sendNotification(
                new NotificationRequest(
                        customer.getId(),
                        customer.getEmail(),
                        String.format("Hi %s, welcome to hell...", customer.getFirstName())
                )
        );
    }
}
