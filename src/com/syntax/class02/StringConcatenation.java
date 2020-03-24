package com.syntax.class02;

public class StringConcatenation {
	public static void main(String[] args) {
		
		//I love java
		String language="Java";
		
		System.out.println("I love"+language);
		
		//I love Java
		String love="I love";
		System.out.println(love+""+language);
		
		String car="BMW";
		//I purchased BMW 2020;
		int year=2020;
		System.out.println("I purchase "+car+ year);
		System.out.println("I purchase "+car+ 2020);
		
	}

}
