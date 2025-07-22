package Java_Interview;

public class REVERSE_Number {

	public static void main(String[] args) {
		usingNumberLogic();
	}

	private static void usingNumberLogic() {
		
		int n = 12345;
		int revNum = 0;
		while(n>0)
		{
			int q = n/10;
			int r = n%10;
			n = q;
			revNum = 10 *  revNum+ r;					
		}
		System.out.println(revNum);		
		
	
	}

}
