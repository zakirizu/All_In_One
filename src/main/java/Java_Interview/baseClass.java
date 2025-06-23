package Java_Interview;
public class baseClass {
	
	
	
	public static  void main(String[] args) {
		baseClass obj = new baseClass("zakir","shaik");		
		baseClass obj2 = new baseClass();		
	}
	
	 public static void zakir() {
		 System.out.println("zakir");
	 }

	 public static void ammu() {
		 System.out.println("ammu");
	 }
	 
	 public   baseClass(String value) {
		 System.out.println("baseClass");
		 System.out.println(value);
		 
	 }
	 
	 public   baseClass(String value, String value2) {
		 System.out.println("baseClass");
		 String fname = value;
		 String lname = value2;
		 System.out.println(lname);
	 }
	 
	 public   baseClass() {
		 System.out.println("baseClass");
		 System.out.println("alpha");
	 }
	 
	 public   baseClass(String value, int  value2) {
		 System.out.println("String and Int");
		 System.out.println(value);
		 System.out.println(value2);
	 }
	 
	 
}
