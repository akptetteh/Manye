package allRepoAssignment;

import java.util.Scanner;

public class Main34 {
	public static void main(String[] args) {

		Scanner input;
		int num1, num2, num3, largest;
		input = new Scanner(System.in);
		System.out.println("Please enter3 distinct numbers");
		num1 = input.nextInt();
		num2 = input.nextInt();
		num3 = input.nextInt();

		if (num1 > num2) {

			if (num1 > num3) {
				largest = num1;
			} else {
				largest = num3;
			}
		} else {
			if (num2 > num3) {
				largest = num2;
			} else {
				largest = num3;
			}

		}
		if (num1 != num2 && num2 != num3) {
			System.out.println("The largest number is " + largest);

		}
	}

}
