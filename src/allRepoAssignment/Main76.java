package allRepoAssignment;

import java.util.Scanner;

public class Main76 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] dayName = new String[8];
		int row = dayName.length;
		for (int d = 1; d <= row - 1; d++) {
			System.out.println("Please enter day " + d + " of the week");
			dayName[d] = input.nextLine();
		}
		System.out.println(dayName[1]);
		System.out.println(dayName[2]);
		System.out.println(dayName[3]);
		System.out.println(dayName[4]);
		System.out.println(dayName[5]);
		System.out.println(dayName[6]);
		System.out.println(dayName[7]);

	}

}
