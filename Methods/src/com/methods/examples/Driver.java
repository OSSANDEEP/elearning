package com.methods.examples;

public class Driver {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		emp1.id =3022;
		emp1.salary = 58435;
		emp1.print(emp1);
	}
	
}

class Employee{
	int id;
	int salary;
	void print(Employee emp) {
		System.out.println(emp.id +" "+emp.salary);
	}
}