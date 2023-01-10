package com.springcloud.microservices.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
@ConfigurationProperties("limits-service")
public class Configuration {
	
	private int min;
	private int max;
	

}
