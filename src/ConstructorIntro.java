package com.syntax.class18;

public class ConstructorIntro {

	//if you do not create a constructor, compiler will create a defaulter constructor
	// for you automatically.
	
	
	// to create a constructor:
	//no return type is needed(not even void)
	//name must be same as class name
	//not return type
	
	ConstructorIntro(){
		System.out.println("I am a constructor");
	}
	public static void main(String[] args) {
		
		ConstructorIntro obj=new ConstructorIntro();
		
		System.out.println("Code after constructor");
	}

}
