package allRepoAssignment;

import java.util.Scanner;

public class Main27 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter your age");
		int age = in.nextInt();
		if (age >= 18) {
			System.out.println("You are eligible to vote");
		} else if (age < 18) {
			System.out.println("You are not eligible to vote");
		}
	}
}
