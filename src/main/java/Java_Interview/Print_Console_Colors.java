package Java_Interview;

public class Print_Console_Colors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  final 	String RESET = "\033[0m";
	       final  String RED = "\033[36m";


	        // Print colored text to the console
	        System.out.println("This text is green." + RED);

	        System.out.println(RED + "This text is green.");
	        System.out.println(RED + "This text is green.");
	}

}
