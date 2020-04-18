package allRepoAssignment;

import java.util.Scanner;

public class Main100 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.print("In:");
		String s = inp.nextLine();
		// write your code below

		String[] stringArray = s.split("");
		for (String arr : stringArray) {
			System.out.print(arr + " ");
		}
		System.out.println();
		String s1 = "";
		String[] stringArray1 = s1.split("");
		for (String arr : stringArray1) {
			System.out.print(arr + " ");

		}
		System.out.println();
		String s2 = "";
		String[] stringArray2 = s2.split("");
		for (String arr : stringArray2) {
			System.out.print(arr + " ");
		}

	}

}
