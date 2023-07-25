package ru.kotov.fraud.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.kotov.fraud.response.FraudCheckResponse;
import ru.kotov.fraud.service.FraudCheckService;

@RestController
@AllArgsConstructor
@RequestMapping("api/v1/fraud-check")
public class FraudCheckController {
    private final FraudCheckService fraudCheckService;
    @GetMapping("/{customerId}")
    public FraudCheckResponse isFraudster(@PathVariable("customerId") Integer customerId) {
        boolean isFraudulentCustomer = fraudCheckService.
                isFraudulentCustomer(customerId);
        return new FraudCheckResponse(isFraudulentCustomer);

    }
}
