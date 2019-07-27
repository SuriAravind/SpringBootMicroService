package com.microservices.currencyconversionservices.bean;

public class CorrencyConversion {

	private long id;
	private String from;
	private String to;
	private float conversionMultiple;
	private float quantity;
	private float totalAmount;
	private int port;
	public CorrencyConversion()
	{
		
	}
	public CorrencyConversion(long id, String from, String to, float conversionMultiple, float quantity,
			float totalAmount, int port) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMultiple = conversionMultiple;
		this.quantity = quantity;
		this.totalAmount = totalAmount;
		this.port = port;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public float getConversionMultiple() {
		return conversionMultiple;
	}
	public void setConversionMultiple(float conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}
	public float getQuantity() {
		return quantity;
	}
	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}
	public float getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(float totalAmount) {
		this.totalAmount = totalAmount;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	
}
