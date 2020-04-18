package allRepoAssignment;

public class Main110 {
	void add(int a, int b) {
		System.out.println("Addition " + (a + b));

	}

	void mul(int a, int b) {
		System.out.println("Multiplication" + (a * b));
	}

	void sub(int a, int b) {
		System.out.println("Subtraction " + (a - b));
	}

	public static void main(String[] args) {
		Main110 mm = new Main110();
		mm.add(10, 20);
		mm.mul(5, 6);
		mm.sub(40, 20);

	}
}
