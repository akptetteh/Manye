package allRepoAssignment;

import java.util.Scanner;

public class Main98 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.print("In:");
		String word = inp.nextLine();
		// write your code below
		for (int i = 0; i < word.length(); i++) {
			System.out.print(i % 2 == 0 ? word.charAt(i) : "");
		}

	}

}
