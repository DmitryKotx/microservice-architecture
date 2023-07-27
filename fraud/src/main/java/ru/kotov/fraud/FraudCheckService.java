package ru.kotov.fraud;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
@Service
@AllArgsConstructor
public class FraudCheckService {
    private final FraudCheckRepository fraudCheckRepository;
    public boolean isFraudulentCustomer(Integer customerId) {
        fraudCheckRepository.save(
                FraudCheck.builder()
                        .customerId(customerId)
                        .isFraudster(false)
                        .createdAt(LocalDateTime.now())
                        .build()

        );
        return false;
    }

}
