package com.dxc.pojos;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	private int productno;
	private double price;
	private int quantity;
	private double discount;
	private String details;

	public Product() {

	}

	public Product(int productno, double price, int quantity, double discount, String details) {
		super();
		this.productno = productno;
		this.price = price;
		this.quantity = quantity;
		this.discount = discount;
		this.details = details;
	}

	public int getProductno() {
		return productno;
	}

	public void setProductno(int productno) {
		this.productno = productno;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	@Override
	public String toString() {
		return "Product [productno=" + productno + ", price=" + price + ", quantity=" + quantity + ", discount="
				+ discount + ", details=" + details + "]";
	}

}
