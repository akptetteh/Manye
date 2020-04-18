package allRepoAssignment;

import java.util.Scanner;

public class Main40 {
	public static void main(String[] args) {
		Scanner scan;
		String name;
		String instructorResponsibility;

		scan = new Scanner(System.in);
		System.out.println("Enter name of the instructor");
		name = scan.nextLine();

		switch (name) {

		case "Shiva":
			instructorResponsibility = "Will take care of Java Assignment";
			break;
		case "Sandish":
			instructorResponsibility = "Will take care of SDLC Assignment";
			break;

		case "Weqas":
			instructorResponsibility = "Will take care of Selenium Assignment";
			break;

		case "Asel":
			instructorResponsibility = "Will take care of every Assignment";
			break;

		default:
			instructorResponsibility = "Invalid instructor selected";
		}
		System.out.println(instructorResponsibility);

	}

}
