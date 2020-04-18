package allRepoAssignment;

import java.util.Scanner;
public class Main96 {
	public static void main(String[] args) {
	    Scanner inp = new Scanner(System.in);
	    System.out.print("In:");
	    String s = inp.nextLine();
	    //write your code below
	    String rev="";
	    for(int i=s.length()-1; i>=0; i--){
	      rev=rev+s.charAt(i);
	    }
	    System.out.print(rev+" ");
	  
	  }

}
