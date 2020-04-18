package allRepoAssignment;

public class Main81 {
	public static void main(String[] args) {
		int[][] a = { { 5, 2, 3, 7 }, { 1, 5, 1, 1 }, { 8, 3, 1, 2 } };

		int largest = a[0][0];
		for (int[] row : a) {
			for (int col : row) {
				if (col > largest) {
					largest = col;
				}
			}
		}
		System.out.println(largest);
	}

}
