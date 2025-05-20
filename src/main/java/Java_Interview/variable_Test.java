package Java_Interview;

public class variable_Test extends Variables{

	public variable_Test(String x, int y) {
		super(x, y);
	}

	
	public variable_Test(String x, int y, String z) {
		super(x, y,z);
		// TODO Auto-generated constructor stub
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		variable_Test obj = new variable_Test("Zoya",8,"Leader");		
		obj.printer();	
		
		
		Variables alp = new Variables("Ammu",4);
		alp.printer();
		


	}
	
	
	public void printer() {
		System.out.println("child Mehtod Data");
		System.out.println("Name is  :"+name);
		System.out.println("Age is :"+age);
		System.out.println("Language is :"+language);
		System.out.println("Full Name  is :"+fullName);
		System.out.println("Gender is :"+gender);
		System.out.println();
	}

}
