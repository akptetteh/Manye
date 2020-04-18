package allRepoAssignment;

public class Main102 {
	String carColor;
	String carMake;
	int carYear;

	void displayCar() {
		System.out.println("Car color is " + carColor + " and car year is " + carYear + " and car model is " + carMake);
	}

	public static void main(String[] args) {
		Main102 car1 = new Main102();
		car1.carColor = "Black";
		car1.carMake = "BMW";
		car1.carYear = 2019;
		car1.displayCar();

		Main102 car2 = new Main102();
		car2.carColor = "White";
		car2.carMake = "Toyota";
		car2.carYear = 2018;
		car2.displayCar();
	}
}
