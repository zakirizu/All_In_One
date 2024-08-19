package Java_Interview;

public class Demo {

	public static void main(String[] args) {

		 
		String s1= "ABCD";
		String s2= "A@B$C^D";
		String removed = s2.replaceAll("[^a-zA-Z0-9]", "");  
		System.out.println(removed);
		System.out.println(s1);
		if(removed.equalsIgnoreCase(s1))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("f");
		}
		
		
		

	}

}
