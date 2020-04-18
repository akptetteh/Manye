package allRepoAssignment;

public class Main80 {
	public static void main(String[] args) {

		double[][] a = { { 1.4, 2.0, 3.3, 2 }, { 4, 1.5, 6.1, 1 }, { 1.2, 3.1, 4, 1.6 } };

		// Double and print array

		double[][] numbers = new double[3][4];
		numbers[0][0] = 1.4;
		numbers[0][1] = 2.0;
		numbers[0][2] = 3.3;
		numbers[0][3] = 2;

		numbers[1][0] = 4;
		numbers[1][1] = 1.5;
		numbers[1][2] = 6.1;
		numbers[1][3] = 1;

		numbers[2][0] = 1.2;
		numbers[2][1] = 3.1;
		numbers[2][2] = 4;
		numbers[2][3] = 1.6;
		System.out.print(2 * numbers[0][0]);
		System.out.print(" " + 2 * numbers[0][1]);
		System.out.print(" " + 2 * numbers[0][2]);
		System.out.println(" " + 2 * numbers[0][3]);
		System.out.print(2 * numbers[1][0]);
		System.out.print(" " + 2 * numbers[1][1]);
		System.out.print(" " + 2 * numbers[1][2]);
		System.out.println(" " + 2 * numbers[1][3]);
		System.out.print(2 * numbers[2][0]);
		System.out.print(" " + 2 * numbers[2][1]);
		System.out.print(" " + 2 * numbers[2][2]);
		System.out.println(" " + 2 * numbers[2][3]);
	}

}
