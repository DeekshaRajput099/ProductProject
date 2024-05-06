package com.dr.product;

public class ProductCreation {
	
private static int radnum=1001;
	
	public Product createProduct( String pname, String pcompany, double price, String color, int qty) {
		
		Product p= new Product(radnum++, pname, pcompany,price, color,qty);
		return p;
	}


}
