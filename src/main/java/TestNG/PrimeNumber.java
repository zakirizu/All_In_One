package TestNG;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkPrime(12);
	}

	private static void checkPrime(int n) {
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				System.out.println("Not Prime");
				break;
			
			}
			else
			{
				System.out.println("Prime");
				break;

			}
		}
		
		
		
		
		
	}

}
