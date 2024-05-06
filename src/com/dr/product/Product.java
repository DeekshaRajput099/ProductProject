package com.dr.product;

public class Product {
	
	private final int pid;
	private String pname;
	private String pcompany;
	private double price;
	private String color;
	private int qty;
	
	
	public Product(int pid, String pname, String pcompany, double price, String color, int qty) {
		this.pid = pid;
		this.pname = pname;
		this.pcompany = pcompany;
		this.price = price;
		this.color = color;
		this.qty = qty;
	}
	
	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPcompany() {
		return pcompany;
	}

	public void setPcompany(String pcompany) {
		this.pcompany = pcompany;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public int getPid() {
		return pid;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", pcompany=" + pcompany + ", price=" + price + ", color="
				+ color + ", qty=" + qty + "]";
	}
	
	

}
