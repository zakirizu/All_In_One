package Java_Interview;

public class swaptwonumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10, b = 20;
		//logic 1 
		System.out.println("Before Swapping numbers are " +a+ " " +b);
		int t=a;
		a=b;
		b=t;
		System.out.println("After Swapping numbers are " +a+ " " +b);
		
		//logic 2 
		b=a+b-(a=b);
		
		System.out.println("After Swapping numbers are " +a+ " " +b);

	}

}
