package com.syntax.class23;

public class FinalExamples {
	
	final String str="I love java";
	
	final void saySomething() {
		System.out.println(str);
	}
	public static void main(String[] args) {
		FinalExamples obj=new FinalExamples();
		//obj.str="I do not like Java";//final variable cannot be changed
		//final cannot be extended
		//final cannot be overridden
		//But finals can be overloaded
	}

}
