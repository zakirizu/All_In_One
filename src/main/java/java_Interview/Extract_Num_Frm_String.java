package java_Interview;

public class Extract_Num_Frm_String {

	public static void main(String[] args) {
		
		/**************************LOGIC*****************************************
		 *  replace method 		- Replaces exact match within the given braces
		 *  reaplceAll Method 	- Replaces the match within the given range
		 * **********************************************************************
		 */
		
	String alpha = "�Phone Num.: (964) 869-5394 (testing) # #asdas-+*�";
	
	
	String str = alpha.replaceAll("[0-9]", "");
	System.out.println(str);
	
	
	String str2 = alpha.replaceAll("[^0-9]", "");
	System.out.println(str2);
	
	
	
	String str3 = alpha.replaceAll("[a-z]", "*");
	System.out.println(str3);
	
	}}