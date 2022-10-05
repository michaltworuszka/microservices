package com.tworuszka.clients.fraud;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "fraud",
        url = "${clients.fraud.url}",
        path = "api/v1/fraud-check")
public interface FraudClient {

    @GetMapping(path = "{customerId}")
    FraudCheckResponse isFraudser(@PathVariable("customerId") Integer customerId);
}
