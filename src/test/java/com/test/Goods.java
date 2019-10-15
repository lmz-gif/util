package com.test;
/**
  * @author lmz
  * @date 2019年10月13日 下午6:40:44
  * 
  */

public class Goods {
	private String name;
	private double price;
	private String type;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Goods(String name, double price, String type) {
		super();
		this.name = name;
		this.price = price;
		this.type = type;
	}
	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + ", type=" + type + "]";
	}
	
}
