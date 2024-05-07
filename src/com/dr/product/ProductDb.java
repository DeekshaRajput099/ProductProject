package com.dr.product;

public class ProductDb {
	
	private Product[]prodarr;
	private int index=0;
	private int prodCount=0;
	
	ProductDb(int size){
		prodarr=new Product[size];
	}
	
	public boolean addProduct(Product p) {
		if(index<prodarr.length) {
			prodarr[index++]=p;
			System.out.println("product details in db");
			prodCount++;
			return true;
		}
		else {
			System.out.println("Database is full");
			return false;
		}
		
	}
	public void viewFulldatabase() {
		System.out.println("-------------------------------------------------");
		System.out.println("ID\tName\tCompany\tColor\tQty");
		System.out.println("----------------------------------------------------");
		
		for(Product prod: prodarr) {
			if(prod!=null) {
				System.out.println(prod.getPid()+"\t"+prod.getPname()+"\t"+prod.getPcompany()+"\t"+prod.getColor()+"\t"+prod.getQty());
				
			}
		}
	}
		public int getProductCount() {
			return prodCount;
		
		}
		
//		public Product searchProduct(int id){
//			Product p= null;
//			for(int )
//			
//		}
		
		public boolean deleteProduct(int id) {
			boolean isDeleted=false;
			for(int i=0;i<prodarr.length;i++) {
				if(prodarr[i]!=null && prodarr[i].getPid()==id) {
					System.out.println("product found in database and deleted");
					prodarr[i]=null;
					isDeleted=true;
					prodCount--;
				}
			}
			if(isDeleted==false) {
				System.out.println("product is not found in database");
			}
			return isDeleted;
		}

	}



