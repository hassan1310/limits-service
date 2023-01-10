package com.springcloud.microservices.bean;

import lombok.Data;

@Data
public class Limit {
	
	private int min;
	private int max;
	
	public Limit(int min, int max) {
		super();
		this.min = min;
		this.max = max;
	}
	
	
	public Limit() {
	}
	

}
