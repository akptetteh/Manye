package com.syntax.class23;

public class Student {
	public void study() {
		System.out.println("Student studies");
		
	}
	public void doHomeWork() {
		System.out.println("Student does homework");
	}
	class SyntaxStudent extends Student{
		//@override
		
		public void Study() {
			System.out.println("Syntax students are coding");
		}
		public void getJob() {
			System.out.println("Syntax students become QA automation engineers");
		}
	}
	class CollegeStudents extends Student{
		
	}
	public void accessParentOverriddenMethod() {
		super
	}
	
public static void main(String[] args) {
	System.out.println("Student object and Reference Student Type ");
	Student student=new Student();
	student.study();
	student.doHomeWork();
	
	System.out.println("SyntaxStudent object and Reference SyntaxStudent Type");
	SyntaxStudent 
	
}
}