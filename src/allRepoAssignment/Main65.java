package allRepoAssignment;

import java.util.Scanner;

public class Main65 {
	public static void main(String[] args) {
		Scanner inp;
		int x;
		System.out.print("In:");
		// write your code below
		inp = new Scanner(System.in);
		x = inp.nextInt();
		for (int i = x - 1; i >= 0; i--) {

			System.out.print(i + " ");
		}
	}

}
