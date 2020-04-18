package com.syntax.class23;

public class Car {
	String make;
	private static Car Car;
	
	public Car(String make) {
		this.make=make;
	}
	public void display() {
		System.out.println("I have "+make);
	}
	public void start() {
		System.out.println(make+" starts by turning key");
	}
	class BMW  extends Car{
		public BMW(String make) {
			super(make);
		}
		public void start() {
			System.out.println(make+" starts by pushing button");
		}
		public void navigate() {
			System.out.println(make+" navigates");
		}
	}
	class Mercedes extends Car{
		public Mercedes(String make) {
			super(make);
		}
		public void start() {
			System.out.println(make+" starts by voice remotely");
		}
		
	}
	class Tesla extends Car{
		public 	Tesla(String make) {
			super(make);
	
	
		}
}
	class Honda extends Car{
		public 	Honda(String make) {
			super(make);
		}
		
	}
	public static void main(String[] args) {
		Car bmw=new BMW("BMW");
		Car tesla=new Tesla("Tesla");
		Car merc=new Mercedes("Mercedes");
		Car honda=new Honda("Honda");
		
		Car[] cars= {new BMW("BMW"), new Tesla("Tesla"), new Mercedes("Mercedes"), new Honda("Honda")};
		
		for(Car c:cars) {
		 c.start();
		 c.display();
		 System.out.println("---------------------");
	}
		System.out.println("-------------------------");
		
		for(int i=0; i<cars.length; i++) {
			cars[i].start();
			cars[i].display();
			
		}
}
}

	