package allRepoAssignment;

import java.util.Scanner;

public class Main99 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.print("In:");
		String word = inp.nextLine();
		// write your code below

		String word3 = "";
		String[] stringArray = word.split("");
		for (String arr : stringArray) {
			System.out.println(arr + " ");
		}
		System.out.println();
		String word1 = "";
		String[] stringArray1 = word1.split("");
		for (String arr : stringArray1) {
			System.out.println(arr + " ");

		}
		System.out.println();
		String word2 = "";
		String[] stringArray2 = word2.split("");
		for (String arr : stringArray2) {
			System.out.println(arr + " ");
		}

	}

}
