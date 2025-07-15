package Java_Interview;

public class REVERSE_Number {

	public static void main(String[] args) {
		
		int n = 12345;
		int mulitplier = 0;
		int finalNum = 0;
		while(n>0)
		{
			int q = n/10;
			int r = n%10;
			n = q;
			System.out.println(r);		
			finalNum = 10 *  finalNum+ r;		
			
		}
		
		System.out.println(finalNum);
	}

}
