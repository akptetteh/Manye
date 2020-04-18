package allRepoAssignment;

import java.util.Scanner;
public class Main28 {
	public static void main(String[] args){
	    Scanner in= new Scanner(System.in);
	    System.out.println("Please enter the length");
	    int length=in.nextInt();
	    System.out.println("Please enter the width");
	    int width=in.nextInt();
	    if(length>width){
	      System.out.println("The shape of your object is rectangle");
	    }else if(length<width){
	      System.out.println("The shape of your object is rectangle");
	    }else{
	      System.out.println("The shape of your object is square");
	    }
	  }
}
