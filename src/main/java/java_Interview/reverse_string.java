package java_Interview;

public class reverse_string {

	public static void main(String[] args) {
		String originalStr = "sakshi";
	    String reversedStr = "";
	  
	        
	 for (int i = 0; i < originalStr.length(); i++) //
	    {
 	      reversedStr = originalStr.charAt(i)+ reversedStr;
	    }
	    
	    System.out.println("Reversed string: "+ reversedStr);


	}

}
