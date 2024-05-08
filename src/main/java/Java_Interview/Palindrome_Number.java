package Java_Interview;

public class Palindrome_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 14641;
		int rev = 0;
		int orgnum = num;
		while(num!=0) {
 			rev = rev*10+num%10;
			num = num/10;
		}
		System.out.println("The reversed number is " +rev);
		if(orgnum==rev) {
			System.out.println("Number is Palindrome");
		}
		else {
			System.out.println("Number is not Palindrome");
		}
		
		

	}

}
