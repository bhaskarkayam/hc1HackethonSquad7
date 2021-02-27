package com.squad7.paymentprocessor;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "sanction-check", url = "localhost:8081")
public interface SanctionsCheckProxy {

    @RequestMapping(value = "/sanctions/{countryCode}", method = RequestMethod.GET)
    public Boolean checkForComplicanceAgainstCountryCode(@PathVariable String countryCode);
}
