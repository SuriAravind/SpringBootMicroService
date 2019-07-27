package com.microservices.currencyexchangeservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.currencyexchangeservice.bean.CurrencyExchange;

@RestController
public class CurrencyExchangeController {

    @Autowired	
    private Environment env;
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyExchange retriveExcange(@PathVariable String from,@PathVariable String to)
	{
	  CurrencyExchange exchange=new CurrencyExchange(1000,from,to,60);
	  exchange.setPort(Integer.parseInt(env.getProperty("local.server.port")));
	  return exchange;
	}
}
