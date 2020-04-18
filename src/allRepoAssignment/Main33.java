package allRepoAssignment;
 
import java.util.Scanner;
public class Main33 {
	public static void main(String[] args){
	    Scanner in= new Scanner(System.in);
	    System.out.println("Please enter a number");
	    int num=in.nextInt();
	    if(num%2==0){
	      System.out.println("Value is even");
	      if(num>1000){
	        System.out.println("Even value is large");
	      }else{
	        System.out.println("Even value is just right");
	      }
	    }else{
	      System.out.println("Value is odd");
	    }
	  }

}
