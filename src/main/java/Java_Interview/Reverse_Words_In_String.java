package Java_Interview;

public class Reverse_Words_In_String {

	public static void main(String[] args) {
		String in 	= "I Am what I am";
		String out 	= "am I what Am I";
		String rev = "";
		
		String[] arr = in.split(" ");
		int		 len = arr.length;
		
		for(int i = len-1; i>0;i--)
		{
			rev = rev+arr[i]+" ";
		}

		//System.out.println(rev);
		
		String trimmedRev = rev;//.stripTrailing();
		System.out.println(trimmedRev);
		
		
		if(trimmedRev.equalsIgnoreCase(out))
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}		
	}

}
