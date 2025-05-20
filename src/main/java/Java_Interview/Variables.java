package Java_Interview;

public class Variables {
	
String name;
int age;
String language;
static String fullName = "Static Zakir Hussain";
static char gender = 'M';
	 
	 
	 
	public static void main(String[] args) {
		testMethod();
		Variables alp = new Variables("Zakir",34);
		alp.printer();
		
		Variables obj = new Variables("Mustq",26,"Selenium");		
		obj.printer();	

	}
	public Variables(String x, int y) {
	name = x;
	age =y;
	}
	public Variables(String x, int y, String z) {
	name = x;
	age =y;
	language =z  ;
	}
	public void printer() {
		System.out.println("Parent Mehtod Data");
		System.out.println("Name is  :"+name);
		System.out.println("Age is :"+age);
		System.out.println("Language is :"+language);
		System.out.println("Full Name  is :"+fullName);
		System.out.println();
	}
	

	private static void testMethod() {
		int z=1;	
		System.out.println(z);		
	}
	
	
}
