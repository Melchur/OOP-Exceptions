//NumberformatException

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		try{
		    Scanner scan =new Scanner(System.in);
		    System.out.print("Enter a number :");
		    String a=scan.nextLine();
		    
		    
		    int b =Integer.parseInt(a);
		    System.out.print(b + " is a number");
		    }
		    catch(NumberFormatException e){
		        System.out.print("Number Exception detected");
		        
		    }
	}
}