package com.exceptionHandling;

public class Test {

	public static void main(String[] args) {
		System.out.println("Main method start");
		try {
			System.out.println("Try block start");
            int i = 10/0;
			System.out.println("Try block end");
		}
		/*catch(Exception e){
			e.printStackTrace();
			System.out.println("Catch block end");
		*/}
		System.out.println("Main method end");
	}
}
