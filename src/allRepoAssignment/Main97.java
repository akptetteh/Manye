package allRepoAssignment;

import java.util.Scanner;

public class Main97 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.print("In:");
		String givenString = inp.nextLine();
		// write your code below

		givenString = givenString.replaceAll(" ", "");
		String str = "";
		boolean t = true;
		boolean f = false;
		for (int i = givenString.length() - 1; i >= 0; i--) {
			str = str + givenString.charAt(i);
		}
		if (str.equalsIgnoreCase(givenString)) {
			System.out.println(t);
		} else {
			System.out.println(f);
		}

	}

}
