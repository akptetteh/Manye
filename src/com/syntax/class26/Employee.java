package com.syntax.class26;

public class Employee {
	//define private variables
	private String name;
	private int age;
	private double salary;
	//Define private methods to give access to private variable getters
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public double getSalary() {
		return salary;
	}
	//setters
	public void setName(String name) {
		if(!name.isEmpty()  && name.length()>3) {
		this.name=name;
	}
	}
    public void setName(int age) {
    	if(age>=18) {
		this.age=age;
	}
    }
    public void setName(double salary) {
		this.salary=salary;
	}
    public static void main(String[] args) {
    	Employee emp=new Employee();
    	emp.setName("Tetteh");
    	System.out.println(emp.getName());
    }

}

