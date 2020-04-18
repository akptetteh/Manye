package allRepoAssignment;

public class Main115 {

	String censorLetter(String str, char c) {

		str = str.replace(c, '*');
		return str;
	}

	public static void main(String[] args) {

		Main115 obj = new Main115();
		System.out.println(obj.censorLetter("computer science", 'e')); // "comput*r sci*nc*"
		System.out.println(obj.censorLetter("trick or treat", 't')); // "*rick or *rea*"
	}
}
