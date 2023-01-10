package com.springcloud.microservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springcloud.microservices.bean.Limit;
import com.springcloud.microservices.configuration.Configuration;

@RestController
public class LimitController {
	
	@Autowired
	private Configuration configuration;
	@GetMapping("/limit")
	public Limit getlimit() {
		Limit limit = new Limit(configuration.getMin(),configuration.getMax());
		System.out.println(limit.getMax());
		return limit;
	}

}
