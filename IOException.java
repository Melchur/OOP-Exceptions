//UserInputWithIOException
package oOP; 
  
 import java.io.BufferedReader; 
 import java.io.IOException; 
 import java.io.InputStreamReader; 
  
public class Main { 
         public static void main(String[] args) { 
                 BufferedReader buff = new BufferedReader(new InputStreamReader(System.in)); 
         while (true) { 
  
                         try { 
 System.out.print("Enter data: "); 
                         String userInput = buff.   readLine(); 
  
 System.out.println("You entered: " + userInput); 
                         }
                         catch (IOException e) { 
                                         System.err.println("An error occurred while closing the input stream: " + e.getMessage()); 
                                 } 
                         } 
                 } 
         }