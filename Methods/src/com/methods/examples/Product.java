package com.methods.examples;

public class Product {

	int pid;
	String pname;
	int price;
	
	public static void main(String[] args) {
		Product p = new Product();
		p.pid = 201;
		p.pname = "Keyboard";
		p.price = 550;
		
		DriverP dp = new DriverP();
		dp.print(p);
	}
}
class DriverP{
	
	
	void print(Product p) {
		System.out.println(p.pid +"  "+p.pname+"  "+p.price);
	}
}
