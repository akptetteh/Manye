package allRepoAssignment;

public class Main114 {
	public static void main(String[] args) {
		Main114 obj = new Main114();
		System.out.println(obj.spaceOut("hello"));
		System.out.println(obj.spaceOut("technology"));
	}

	String spaceOut(String str) {

		String newString = "";

		for (int i = 0; i < str.length(); i++) {
			newString = newString + str.charAt(i) + " ";
		}

		return newString;
	}

}
