package java_Interview;

public class reverse_string {

	public static void main(String[] args) {
		String originalStr = "ABCD";
	    String reversedStr = "";
	    System.out.println("Original string: " + originalStr);
	    int len = originalStr.length();
	    System.out.println("length of the string is " +len);
	        
	 for (int i = 0; i < originalStr.length(); i++) //
	    {
 	      reversedStr = originalStr.charAt(i)+ reversedStr;
	    }
	    
	    System.out.println("Reversed string: "+ reversedStr);


	}

}
