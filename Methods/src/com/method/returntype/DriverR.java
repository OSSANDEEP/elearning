package com.method.returntype;

public class DriverR {

	public static void main(String[] args) {

		DriverR dr =  new DriverR();		
		PersonO po = dr.getById(102);
		System.out.println(po.id+" "+po.name+" "+po.age);
	}
	PersonO getById(int id) {
		
		PersonO p = new PersonO();
		
		if(id == 101) {
			p.id = 101;
			p.name ="Raju";
			p.age = 43;
		}
		else if(id == 102){
			p.id = 102;
			p.name = "Rani";
			p.age =35;

		}
		return p;
	}

}
class PersonO{
	int id;
	String name;
	int age;
}
