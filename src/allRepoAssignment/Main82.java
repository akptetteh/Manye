package allRepoAssignment;

public class Main82 {
	public static void main(String[] args) {
		int[][] a = { { -5, -2, -3, 7 }, { 1, -5, -2, 2 }, { 1, -2, 3, -4 } };

		int sum = 0;
		for (int[] row : a) {
			for (int col : row) {
				sum += col;
			}
		}
		System.out.println(sum);

	}

}
