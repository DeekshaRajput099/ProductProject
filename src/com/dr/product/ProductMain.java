package com.dr.product;

public class ProductMain {
	
	public static void main(String[] args) {
		
		ProductCreation pr=new ProductCreation();
		
		Product p1=pr.createProduct("LED","Sony", 30000.0, "silver", 2);
		Product p2=pr.createProduct("Laptop","HP",50000.0,"black", 4);
		Product p3=pr.createProduct("SmartPhone","Samsung",70000.0, "blue", 7);
		
		ProductDb pdb=new ProductDb(10);
		
		pdb.addProduct(p1);
		pdb.addProduct(p2);
		pdb.addProduct(p3);
		
		System.out.println("total product:"+pdb.getProductCount());
		
		pdb.viewFulldatabase();
		
	}

}
