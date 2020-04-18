package allRepoAssignment;

import java.util.Scanner;

public class Main45 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Input a number between 1-7");

		String dayName;
		int num;
		num = input.nextInt();
		switch (num) {
		case 1:
			dayName = "Monday";
			break;
		case 2:
			dayName = "Tuesday";
			break;
		case 3:
			dayName = "Wednesday";
			break;
		case 4:
			dayName = "Thursday";
			break;
		case 5:
			dayName = "Friday";
			break;
		case 6:
			dayName = "Saturday";
			break;
		case 7:
			dayName = "Sunday";
			break;
		default:
			dayName = "Invalid";
		}
		System.out.println(dayName);
	}

}
