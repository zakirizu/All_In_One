package Java_Interview;

public class parent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parent p = new parent();
		p.car();
		p.home("Kurnool-Home");

	}
	
	public  void car() {
		System.out.println("Alto");
	}

	
	public  void home(String name) {
		System.out.println(name);
		System.out.println("Kurnool-Home");
	}
	
	
	public  void home() {
		System.out.println("Betamcharla-Home");
	}
	
	public  void home(int name) {
		System.out.println(name);
	}
}
