package Java_Interview;

public class Reverse_String_Using_For_loop {

	public static void main(String[] args) {
		String str = "zakir";
		String rev = "";
		int len = str.length();
		for( int i=len-1; i>=0; i--)
		{
			 rev = rev+ str.charAt(i);
		}
		System.out.println(rev);
		}
		

	}


