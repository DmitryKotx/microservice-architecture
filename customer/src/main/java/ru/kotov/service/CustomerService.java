package ru.kotov.service;

import org.springframework.stereotype.Service;
import ru.kotov.model.Customer;
import ru.kotov.repository.CustomerRepository;
import ru.kotov.request.CustomerRegistrationRequest;
@Service
public record CustomerService(CustomerRepository customerRepository) {
    public void registerCustomer(CustomerRegistrationRequest request) {
        Customer customer = Customer.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .build();
        customerRepository.save(customer);

    }
}
