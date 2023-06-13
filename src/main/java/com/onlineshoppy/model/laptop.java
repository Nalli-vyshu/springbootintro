package com.onlineshoppy.model;

public class laptop {
	
	private int laptopId;
	private String laptopName;
	private String laptopProcessor;
	private int laptopPrice;
	public laptop(int laptopId, String laptopName, String laptopProcessor, int laptopPrice) {
		super();
		this.laptopId = laptopId;
		this.laptopName = laptopName;
		this.laptopProcessor = laptopProcessor;
		this.laptopPrice = laptopPrice;
	}
	public int getLaptopId() {
		return laptopId;
	}
	public void setLaptopId(int laptopId) {
		this.laptopId = laptopId;
	}
	public String getLaptopName() {
		return laptopName;
	}
	public void setLaptopName(String laptopName) {
		this.laptopName = laptopName;
	}
	public String getLaptopProcessor() {
		return laptopProcessor;
	}
	public void setLaptopProcessor(String laptopProcessor) {
		this.laptopProcessor = laptopProcessor;
	}
	public int getLaptopPrice() {
		return laptopPrice;
	}
	public void setLaptopPrice(int laptopPrice) {
		this.laptopPrice = laptopPrice;
	}
	@Override
	public String toString() {
		return "laptop [laptopId=" + laptopId + ", laptopName=" + laptopName + ", laptopProcessor=" + laptopProcessor
				+ ", laptopPrice=" + laptopPrice + "]";
	}

	
}
