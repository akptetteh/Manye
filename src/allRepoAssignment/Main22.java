package allRepoAssignment;

import java.util.Scanner;
public class Main22 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = input.nextLine();
		System.out.println("Enter your mobile number");
		String mobileNumber = input.nextLine();
		String s1 = String.valueOf(mobileNumber);
		String phoneFormat = (s1.replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1)-$2-$3"));
		System.out.println("Enter your age");
		int age = input.nextInt();
		System.out.println(
				"Your name is " + name + ", " + " your age is " + age + " and your mobile number is " + phoneFormat);
	}
}
