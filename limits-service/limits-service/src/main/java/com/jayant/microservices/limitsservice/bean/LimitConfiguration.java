package com.jayant.microservices.limitsservice.bean;

public class LimitConfiguration {
	private int maximum;
	private int minimum;
	public LimitConfiguration(int maximum, int minimum) {
		super();
		this.maximum = maximum;
		this.minimum = minimum;
	}
	protected LimitConfiguration() {
		super();
	}
	public int getMaximum() {
		return maximum;
	}
	
	public int getMinimum() {
		return minimum;
	}
	
	
	

}
