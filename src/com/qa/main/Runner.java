package com.qa.main;

public class Runner {

	public static void main(String[] args) {
		
		Numbers num1 = new Numbers();
		System.out.println(num1.adder(2, 5));
		System.out.println(num1.numbertoString(9, 9));
		System.out.println(num1.numbertoString(20, 1));
		System.out.println(num1.numbertoString(30, 5));


	}

}
