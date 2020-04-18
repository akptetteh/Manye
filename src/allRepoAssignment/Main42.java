package allRepoAssignment;

import java.util.Scanner;

public class Main42 {
	public static void main(String[] args) {
		// write code below
		/*
		 * if sutdent roll number is 101-->Student name: Ramesh /*if student roll number
		 * is 102-->Student name: Mahesh /*if student roll number is 103-->Student
		 * name:Mukesh /*Other than this roll
		 * number-->"Not found student name: in Class"
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("enter the roll number of the Child");
		String studentName;
		int num;
		num = input.nextInt();
		switch (num) {
		case 101:
			studentName = "Student name:Ramesh";
			break;
		case 102:
			studentName = "Student name:Mahesh";
			break;
		case 103:
			studentName = "Student name:Mukesh";
			break;
		default:
			studentName = "Not found student name:in Class";
		}
		System.out.println(studentName);
	}

}
