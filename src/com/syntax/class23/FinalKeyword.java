package com.syntax.class23;

public class FinalKeyword {
	static String str="Hello";
	public static final String str1="Bye";// final variable =CONSTANT
	//Final variables are always public or static
	//final values cannot be changed-it is non-access modifier
	//final keyword can be used with classes, methods and variables
	
	static final String APPLICATION_URL="https://syntaxtechs.com";
	public static final char GRADE='A';

	public final void hello() {
		System.out.println("I am a final method");
	}
	public final void hello(String name) {
		System.out.println("Hell"+name);
	}
	public void hello(int num) {
		System.out.println("hello of child class");
		
	}

class SubClass extends FinalKeyword{
}

	public static void main(String[] args) {
		str="Hi";
		//Final values cannot be run
		//str1=+"Good bye"; CE:
		//applicationUrl="http://google.com"
	}

}

