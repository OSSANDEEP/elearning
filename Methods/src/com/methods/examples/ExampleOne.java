package com.methods.examples;

public class ExampleOne {

	public static void main(String[] args) {

	Student s1 = new Student();
	s1.id = 10;
	s1.name = "Arjun";

	System.out.println(s1.id+"  "+s1.name);
	}
}
class Student{
	
	int id;
	String name;
}

