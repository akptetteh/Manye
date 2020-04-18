package allRepoAssignment;

public class Main113 {
	void sumEvenToX(int x) {
		int sum = 0;
		for (int i = 0; i <= x; i += 2) {
			sum = sum + i;
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		Main113 object = new Main113();
		object.sumEvenToX(5);
		object.sumEvenToX(8);

	}

}
