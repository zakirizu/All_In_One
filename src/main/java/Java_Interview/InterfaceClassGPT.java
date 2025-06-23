package Java_Interview;

interface InterfaceClassGPT {



	interface MyInterface {

	    // Abstract method
	    void greet(String name);

	    // Static method
	    static void info() {
	        System.out.println("Static method in interface: MyInterface info");
	    }

	    // Default method
	    default void show() {
	        System.out.println("Default method: Starting show()");
	        helper(); // calling private method
	    }

	    // Private method (Java 9+)
	    private void helper() {
	        System.out.println("Private helper method inside interface");
	    }
	}


}
