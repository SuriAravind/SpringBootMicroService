package com.microservices.limitsservice.bean;

public class LimitsServiceTodo {
	private int min;
	private int max;
	public LimitsServiceTodo()
	{
		
	}
	
	public LimitsServiceTodo(int min, int max) {
		super();
		this.min = min;
		this.max = max;
	}
   public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}

	@Override
	public String toString() {
		return "LimitsServiceTodo [min=" + min + ", max=" + max + "]";
	}
}
