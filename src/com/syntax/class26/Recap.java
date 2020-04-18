package com.syntax.class26;

public class Recap {
	public static void main(String[] args) {
		int num=10;
		Doctor doctor=new Doctor();
		
		int[] numbers = {10, 20, 30, 40};
		Doctor[] Doctor= {new Doctor(), new Doctor(), new Doctor()};
		
		String[] names=new String[2];
		names[0]="Vital";
		names[1]="Prince";
		
		System.out.println("------------");
		//during runtime, our java will give an exception because arrays are fixed in size
		//names[2]="Jawaid";
	}

}
