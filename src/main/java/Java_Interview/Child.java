package Java_Interview;

public class Child extends parent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child();
		c.car();
		c.home("5");

	}
		
	public  void car() {
		System.out.println("WolksWagon");
	}
	
	
	public  void home() {
		System.out.println("Hyderbad-Home");
	}

	
	
	
	public  void home(int name) {
		System.out.println(name);
	}
	
	
}
