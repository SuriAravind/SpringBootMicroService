package com.microservices.currencyconversionservices;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.microservices.currencyconversionservices.bean.CorrencyConversion;

@FeignClient(name = "curreny-exchange-service", url = "localhost:8000")
public interface CurrencyConversionProxy {
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CorrencyConversion retriveExcange(@PathVariable("from") String from, @PathVariable("to") String to);
}
