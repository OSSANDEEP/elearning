package com.methods.examples;

public class DriverD {

	public static void main(String[] args) {
		DriverD dd = new DriverD();
		
		Doctor d = new Doctor();
		d.did = 432;
		d.dname = "Arjun";
		d.age =32;
		dd.print(d);
	}
	void print(Doctor d) {
		System.out.println(d.did+" "+d.dname+" "+d.age);
	}
}

class Doctor{
	int did;
	String dname;
	int age;
}
