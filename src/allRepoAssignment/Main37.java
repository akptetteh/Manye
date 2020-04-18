package allRepoAssignment;

import java.util.Scanner;

public class Main37 {
	public static void main(String[] args) {
		Scanner input;
		String isThirsty, isSleepy, user;
		input = new Scanner(System.in);
		System.out.println("Are you thirsty?");
		isThirsty = input.nextLine();
		System.out.println("Are you sleepy?");
		isSleepy = input.nextLine();
		if (isThirsty.equalsIgnoreCase("true") && isSleepy.equalsIgnoreCase("false")) {
			user = "Water";
		} else if (isThirsty.equalsIgnoreCase("true") && isSleepy.equalsIgnoreCase("true")) {
			user = "Coffee";
		} else if (isThirsty.equalsIgnoreCase("false") && isSleepy.equalsIgnoreCase("true")) {
			user = "Tea";
		} else {
			user = "Nothing";
		}
		System.out.println("Looks like you need to drink " + user);
	}

}
