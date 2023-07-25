package ru.kotov.fraud.controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import ru.kotov.clients.fraud.FraudCheckResponse;
import ru.kotov.clients.fraud.FraudClient;
import ru.kotov.fraud.service.FraudCheckService;

@Slf4j
@RestController
@AllArgsConstructor
public class FraudCheckController implements FraudClient {
    private final FraudCheckService fraudCheckService;

    @Override
    public FraudCheckResponse isFraudster(Integer customerId) {
        boolean isFraudulentCustomer = fraudCheckService.
                isFraudulentCustomer(customerId);
        log.info("fraud check request for customer {}", customerId);
        return new FraudCheckResponse(isFraudulentCustomer);
    }
}
