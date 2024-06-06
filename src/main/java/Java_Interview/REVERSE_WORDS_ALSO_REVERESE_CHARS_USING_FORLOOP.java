package Java_Interview;

public class REVERSE_WORDS_ALSO_REVERESE_CHARS_USING_FORLOOP {

	public static void main(String[] args) {
		
		String str = "apple boy cat";
		String[] arr = str.split(" ");
		//Now taking each word from the given statement as String
		for(int i=arr.length-1; i>=0; i--)
		{
			String temp = arr[i];
			String rev ="";
			//Now reversing each
			for(int j=temp.length()-1; j>=0;j--)
				{
					rev = rev + temp.charAt(j);
				}
			
			System.out.print(rev+ " " );
			
		}	
	}

}
