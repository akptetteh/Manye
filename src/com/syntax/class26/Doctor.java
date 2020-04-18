package com.syntax.class26;

public class Doctor {
	private long licenseID;
	private long phoneNumber;
	private String email;
	
public void setEmail() {
	if(!email.isEmpty()) {
		if(email.contains("gmail")) {
		
	this.email=email;
}else {
	System.out.println("Email cannot be empty");
}
}
}
public static void main(String[] args) {
	Doctor doc=new Doctor();
	doc.setEmail("doctor@gmail.com");
	System.out.println((doc.getEmail()));
	
}
}