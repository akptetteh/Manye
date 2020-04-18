package Review8;

public class Human {
	String name;
	static String planet;
	
	public Human(String name) {
		this.name=name;
		 
	}
	public void talk() {
		System.out.println(name+" human beings talk");
	}

public class Turkish extends Human{
	public Turkish(String name) {
		super(name);
	}
	public void talk() {
		System.out.println(name+" talk very well");
	}
}
public class Russian extends Human{
	public Russian(String name) {
		super(name);
	}
	@Override
	public void() {
		System.out.println(name+" speaks French");
		
	}
	public void pickMushrooms() {
		
	}
}
	public static void main(String[] args) {
		Human obj=new Human("Prince");
		System.out.println("The best student is "+obj.name);
		
		Human obj1=new Human("Tetteh");
		System.out.println(obj1+" live in "+obj1.planet);
		
		Human obj2=new Turkish("Ali");
		System.out.println(name+" lives in"+ obj2.Human);
		
	}

}
