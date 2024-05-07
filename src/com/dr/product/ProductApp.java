package com.dr.product;

import java.util.Scanner;

public class ProductApp {
	
	public static void main(String[] args) {
		Service s= new Service();
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the size of database.....");
		int size= sc.nextInt();
		s.createDatabase(size);
		
		while(true) {
			System.out.println("----------menu----------------");
			System.out.println("1.Add product\n2.find by id");
			System.out.println("3.find by company\n4.update by id");
			System.out.println("5.all details\n6.Exit");
			System.out.println("enter the option:-");
			
			int op=sc.nextInt();
			switch(op) {
			case 1:s.addProduct();break;
			case 2:s.FindById();break;
			case 3:s.FindByCompany();;break;
			case 4:s.UpdateById();break;
			case 5:s.AllDetails();break;
			case 6:System.out.println("thank you");
			System.exit(0);
			default:System.out.println("invalid option");break;
			}
		}
		
	}

}
