package allRepoAssignment;

import java.util.Scanner;

public class Main100a {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.print("In:");
		String s = inp.nextLine();
		// write your code below

		String newString = "";
		for (int i = 0; i <= s.length() - 1; i++) {

			if (i != s.length() - 1) {
				newString = newString + s.charAt(i) + " ";
			} else {
				newString = newString + s.charAt(i);
			}

		}

		System.out.println(newString);
	}

}
