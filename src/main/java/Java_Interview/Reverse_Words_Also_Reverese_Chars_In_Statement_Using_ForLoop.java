package Java_Interview;

public class Reverse_Words_Also_Reverese_Chars_In_Statement_Using_ForLoop {

	public static void main(String[] args) {

		String str = "Blessed Bluestone means commitment Bluestone Helpline";
		String[] strArr = str.split(" ");
	
		for(int i=strArr.length-1; i>=0 ; i--)
		{
			String temp = strArr[i];
			String rev  = "";

			
			for( int j = temp.length()-1; j>=0; j--)
			{
				rev = rev+temp.charAt(j);
			}
			
			System.out.print(rev+" ");
			
		}
		
	

	}

}
