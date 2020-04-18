package allRepoAssignment;

import java.util.Scanner;

public class Main35 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Do you need a loan?");
		String answer = input.nextLine();
		String scoreResult;
		int creditScore = 0;
		if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("true")) {
			System.out.println("What is your credit score");
			creditScore = input.nextInt();
			if (creditScore < 600) {
				scoreResult = "Not eligible";
			} else if (creditScore >= 600 && creditScore <= 700) {
				scoreResult = "Maybe eligible";
			} else if (creditScore > 700 && creditScore <= 800) {
				scoreResult = "Eligible";
			} else if (creditScore > 800) {
				scoreResult = "Definitely eligible";
			} else {
				scoreResult = "Unknown";
			}
		} else {
			scoreResult = "Unknown";
		}
		System.out.println("The eligibility is " + scoreResult);
	}

}
