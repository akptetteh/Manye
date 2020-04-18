package com.syntax.class23;

public class Animal {
	public static void WhoAmI() {
		System.out.println("I am an animal");
	}
	public void sleep() {
		System.out.println("Animal sleeps");
	}
	public void display() {
		System.out.println("I am an animal");
	}
}
class Bird extends Animal{
	
	//Method hiding.
	//static methods cannot be overridden
	public static void WhoAmI() {
		System.out.println("I am a bird");
	}
	public void sleep() {
		System.out.println("Bird sleeps");
	}
	public void display() {
		System.out.println("");
	}
public static void main(String[] args) {
	Animal animal=new Animal();
	animal.sleep();
	animal.display();
	animal.WhoAmI();
	Animal.WhoAmI();
	Bird.WhoAmI();
	
}
}