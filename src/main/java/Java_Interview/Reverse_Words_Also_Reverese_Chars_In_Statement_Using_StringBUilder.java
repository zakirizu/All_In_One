package Java_Interview;

public class Reverse_Words_Also_Reverese_Chars_In_Statement_Using_StringBUilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String 		str = "Zakeer Hussain Shaik";
		String[] 	arr = str.split(" ");
		for( int i=arr.length-1;i>=0;i--)
		{
			String temp = arr[i];
			StringBuilder sb = new StringBuilder(temp);
			StringBuilder rev = sb.reverse();
			System.out.print(rev+" ");
		}

	}
	

}
