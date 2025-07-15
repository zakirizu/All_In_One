package TestNG;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int lastnumber = 10;
		int first=0, second =1;
		
		for(int i=0; i<=lastnumber; i++)
		{
			System.out.print(first +",");
			int next = first+second;
			first = second;
			second = next;
						
		}
		
		
		

	}

}
