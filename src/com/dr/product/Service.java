package com.dr.product;

import java.util.Scanner;


public class Service {
	
	Product[] arr;
	int k;

	Scanner sc= new Scanner(System.in);
	public void createDatabase(int size) {
		System.out.println("create database");
		arr=new Product[size];
		
	}
	
	void addProduct() {
		System.out.println("-----Adding into Database");
		int pid=sc.nextInt();
		System.out.println("enter product name");
		String pname=sc.next();
		System.out.println("enter product price");
		double price=sc.nextDouble();
		System.out.println("enter product company");
		String company=sc.next();
		System.out.println("enter the quantity");
		int qty=sc.nextInt();
		
		Product p= new Product(pid, pname, company, price, company, qty);
		arr[k]=p;
		k++;
		System.out.println("product had been added database");
	}
	
		void FindById() {
		System.out.println("enter the id:-");
		int c=0;
		int pid=sc.nextInt();
		for(Product ele:arr) {
			if(ele.getPid()==pid) {
				System.out.println("Pid:"+ele.getPid());
				System.out.println("Pname:"+ele.getPname());
				System.out.println("price:"+ele.getPrice());
				System.out.println("Company:"+ele.getPcompany());
				System.out.println("qty"+ele.getQty());
				c++;
				break;
				
			}
		}
		if(c==0) {
			System.out.println("Id not found");
		}
		
	}
	
	void FindByCompany() {
		System.out.println("enter the company");
		
		int c=0;
		String pcompany=sc.next();
		for(Product ele:arr) {
			if(ele.getPcompany()==pcompany) {
				System.out.println("Pid:"+ele.getPid());
				System.out.println("Pname:"+ele.getPname());
				System.out.println("price:"+ele.getPrice());
				System.out.println("Company:"+ele.getPcompany());
				System.out.println("qty"+ele.getQty());
				c++;
				break;
				
			}
			
		}
		
		if(c==0) {
			System.out.println("company not found");
		}
	}
	
	void UpdateById() {
		
	}
	
	void AllDetails() {
		System.out.println("-------------------------------------------------");
		System.out.println("ID\tName\tCompany\tColor\tQty");
		System.out.println("----------------------------------------------------");
		int c=0;
		
		for(Product prod: arr) {
			if(prod!=null) {
				System.out.println(prod.getPid()+"\t"+prod.getPname()+"\t"+prod.getPcompany()+"\t"+prod.getColor()+"\t"+prod.getQty());
				
			}
		}
	}
		
	}


