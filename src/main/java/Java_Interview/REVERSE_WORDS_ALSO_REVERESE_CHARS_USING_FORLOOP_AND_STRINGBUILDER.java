package Java_Interview;

public class REVERSE_WORDS_ALSO_REVERESE_CHARS_USING_FORLOOP_AND_STRINGBUILDER {

	public static void main(String[] args) {
		String str 		= "apple boy cat";
		String[] arr 	= str.split(" ");
		
		for(int i= arr.length-1; i>=0; i--)
		{
			String temp = arr[i];
			StringBuilder sb = new StringBuilder(temp);
			StringBuilder rev = sb.reverse();
			System.out.print(rev+" ");
			
		}
		
			
	}

}
