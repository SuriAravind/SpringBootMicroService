package com.microservices.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.limitsservice.bean.LimitsServiceTodo;

@RestController
public class LimitsServiceController {

	@Autowired
	private Config config;
	@GetMapping("/limits")
	public LimitsServiceTodo getvalue()
	{
		return new LimitsServiceTodo(config.getMin(),config.getMax());
	}
}
