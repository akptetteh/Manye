package allRepoAssignment;

import java.util.Scanner;

public class Main38 {
	public static void main(String[] args) {
		boolean b1;
		Scanner scan;
		String subject;
		scan = new Scanner(System.in);

		System.out.println("Is it weekend?");
		b1 = scan.nextBoolean();
		subject = scan.nextLine();
		System.out.println(subject);

		if (!b1) {
			System.out.println("Today you will be learning Manual testing");
		} else
			System.out.println("Today you will be learning Java");

	}
}
