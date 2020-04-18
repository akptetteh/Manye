package allRepoAssignment;

import java.util.Scanner;

public class Main32 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter your gender:M or F");
		String gender = in.nextLine();
		System.out.println("Please enter your age");
		int age = in.nextInt();

		if (age >= 25 && (gender.equalsIgnoreCase("F"))) {
			System.out.println("Woman");
		} else if (age <= 25 && (gender.equalsIgnoreCase("F"))) {
			System.out.println("Girl");

		} else if (age < 25 && (gender.equalsIgnoreCase("M"))) {
			System.out.println("Boy");
		} else {
			System.out.println("Man");
		}

	}

}
