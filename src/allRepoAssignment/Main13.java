package allRepoAssignment;

public class Main13 {
	public static void main(String[] args) {

		// performing mathematic magic tricks

		int myNumber = 60;
		int originalNumber = myNumber;
		int stepOne = originalNumber * originalNumber;
		int stepTwo = stepOne + originalNumber;
		int stepThree = stepTwo / originalNumber;
		int stepFour = stepThree + 17;
		int stepFive = stepFour - originalNumber;
		int stepSix = stepFive / 6;

		System.out.println("The magic number is " + stepSix + "!");

	}

}
