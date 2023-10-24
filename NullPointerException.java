//NullPointer


public class Main {
	public static void main(String[] args) {
		
		try{
		    String a=null;
		    System.out.print("String is : " + a.charAt(0));
		    }
		    
		    catch(NullPointerException e){
		        
		        System.out.println("NullPointerException Detected");
		        
		        }
	}
}