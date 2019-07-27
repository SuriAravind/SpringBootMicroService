package com.microservices.currencyexchangeservice.bean;

public class CurrencyExchange {

	private long id;
	private String from;
	private String to;
	private float conversionMultiple;
	private int port;

	public CurrencyExchange() {
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public CurrencyExchange(long id, String from, String to, float conversionMultiple) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMultiple = conversionMultiple;
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

}
