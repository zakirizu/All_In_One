package Java_Interview;

public class TestClassChild extends TestClassparent{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestClassChild obj = new TestClassChild();
		obj.add(6, 4, 'C');

	}

	public static void add(int a, int b)
	{
		System.out.println("Zakir-Child-Zoya");
		System.out.println(a+b);
	}
	
	public static void add(int a, int b, char c)
	{
		System.out.println("Zakir-Child Amyrah");
		System.out.println(a+b+c);
	}
	
	
	
	
}
