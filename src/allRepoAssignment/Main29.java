package allRepoAssignment;

import java.util.Scanner;

public class Main29 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter first number");
		int x = in.nextInt();
		System.out.println("Please enter second number");
		int y = in.nextInt();
		if (x * y > 0) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

	}
}
