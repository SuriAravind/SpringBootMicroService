package com.microservices.currencyconversionservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.currencyconversionservices.bean.CorrencyConversion;

@RestController
public class CurrencyConversionController {

	@Autowired
	private CurrencyConversionProxy proxy;

	@GetMapping("/currency-conversion/from/{from}/to/{to}/quantity/{quantity}")
	public CorrencyConversion retrive(@PathVariable String from, @PathVariable String to,
			@PathVariable float quantity) {
		CorrencyConversion response = proxy.retriveExcange(from, to);
		return new CorrencyConversion(response.getId(), from, to, response.getConversionMultiple(), quantity,
				(response.getConversionMultiple() * quantity), response.getPort());
	}
}
