package allRepoAssignment;

import java.util.Scanner;

public class Main36 {
	public static void main(String[] args) {
		Scanner input;
		int int1, int2;
		String word1, word2;
		input = new Scanner(System.in);
		System.out.println("Please enter two strings");
		word1 = input.nextLine();
		word2 = input.nextLine();
		System.out.println("Please enter two numbers");
		int1 = input.nextInt();
		int2 = input.nextInt();

		if (int1 == int2 && (word1.equals(word2))) {
			System.out.println("AND");
		} else if (int1 == int2 || ("word1".equals(word2))) {
			System.out.println("OR");
		} else {
			System.out.println("NONE");

		}
	}

}
