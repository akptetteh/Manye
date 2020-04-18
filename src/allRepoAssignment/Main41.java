package allRepoAssignment;

import java.util.Scanner;

public class Main41 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int age;
		System.out.println("enter the age of the child");
		age = input.nextInt();
		String ageOfChild;

		switch (age) {
		case 1:
			ageOfChild = "You can Crawl";
			break;

		case 2:
			ageOfChild = "You can Talk";
			break;
		case 3:
			ageOfChild = "You can dance";
			break;
		case 4:
			ageOfChild = "You can get Trouble";
			break;
		default:
			ageOfChild = "I don't know how old you are";
		}
		System.out.println(ageOfChild);

	}

}
