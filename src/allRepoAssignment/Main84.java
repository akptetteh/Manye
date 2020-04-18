package allRepoAssignment;

public class Main84 {
	public static void main(String[] args) {
		int[][] a = { { -5, -2, -3, 7 }, { 1, -5, -2, 2 }, { 1, -2, 3, -4 } };

		int row = a.length;
		int counter = 0;
		for (int i = 0; i <= row - 1; i++) {
			for (int j = 0; j < 3; j++) {
				if ((a[i][j] % 2 != 0) && (a[i][j] < 0)) {
					counter += 1;
				}
			}
		}

		System.out.println(counter);
	}

}
