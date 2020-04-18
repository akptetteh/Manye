package com.syntax.class26;

public class Registration {
	
		//define private variables
		private String email;
		private String userName;
		private String passWord;
		//Define private methods to give access to private variable getters
		
		public void getemail(String email) {
			if(email.endsWith("Yahoo.com"))
			this.email=email;
		}
		public void getUserName(String userName) {
			if(!userName.isEmpty() && userName.length()>6) {
			this.userName=userName;
			}else {
				System.out.println("Username cannot be empty and length should be more than 6 characters");
			}
		}
			public void getPassWord(String passWord) {
				if(!passWord.isEmpty()) {
					if(passWord.length()>6) {
						if(!passWord.contains(userName)) {
				this.passWord=passWord;
				}else {
					System.out.println("Password cannot contain username");
				}
					
				
			}else {
				System.out.println("Password is too short");
			}
		}else {
			System.out.println("password cannot be empty");
		}
			}
		
		
		
	    public static void main(String[] args) {
	    	Registration obj=new Registration();
	    	obj.getemail("kpokpookpoo@gmail.com");
	    	Object kpokpookpoo;
			Object gmail;
			System.out.println();
	    	
	    	obj.getUserName("akptetteh");
	    	char[] getUserName = null;
			System.out.println(getUserName);
	    }

	}

