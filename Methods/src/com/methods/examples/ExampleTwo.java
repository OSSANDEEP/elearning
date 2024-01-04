package com.methods.examples;

public class ExampleTwo {

	
	public static void main(String[] args) {
		
		ExampleTwo et = new ExampleTwo();
		
		StudentTwo st1 = new StudentTwo();
		st1.id = 201;
		st1.name = "Ramesh";
		st1.age = 32;
		et.print(st1);
	}
	public void print(StudentTwo st) {
		System.out.println(st.id+" "+st.name+" "+st.age);
	}
}
class StudentTwo{
	int id;
	String name;
	int age;
}