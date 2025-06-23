package Java_Interview;


	public class ImplementationClassGPT implements InterfaceClassGPT {

	    public void greet(String name) {
	        System.out.println("Hello, " + name + "!");
	    }

	    public static void main(String[] args) {
	    	ImplementationClassGPT obj = new ImplementationClassGPT();

	        // Calling abstract method implementation
	        obj.greet("Zakir");

	        // Calling default method
	         ((MyInterface) obj).show();

	        // Calling static method from interface
	        MyInterface.info();
	    }
	}


