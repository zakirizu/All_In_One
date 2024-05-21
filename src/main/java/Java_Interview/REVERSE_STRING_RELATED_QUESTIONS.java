package Java_Interview;

public class REVERSE_STRING_RELATED_QUESTIONS {

	public static void main(String[] args) {
		STRING_METHODS();
		Reverse_String_Using_For_Loop();
		Reverse_String_Using_String_Builder();
		Reverse_Given_Statment();
		Reverse_Words_Also_Reverese_Chars_Using_ForLoop();
		Reverse_Words_Also_Reverese_Chars_Using_StringBuilder();
		Reverse_Words_Also_Reverese_Chars_Using_Forloop_and_StringBuilder();
	}

	private static void STRING_METHODS() {
		String s = "Sachin ";
		//LOWER CASE UPPER CASE
		System.out.println(s.toUpperCase());//SACHIN    
		System.out.println(s.toLowerCase());//sachin    
		
		//STARTS WITH ENDS WITH
		 System.out.println(s.startsWith("Sa"));//true    
		 System.out.println(s.endsWith("n "));//true  
		 System.out.println(s.startsWith("Za"));//true    
		 System.out.println(s.endsWith("in"));//true    
		 
		 //CHATAT
		 System.out.println(s.charAt(0));//S    
		 System.out.println(s.charAt(3));//h    
		 
		 //REPLACE OCCURANCE OF WORD
		 String s1="Java is a programming language. Java is a platform. Java is an Island.";      
		 String replaceString=s1.replace("Java","Kava");//replaces all occurrences of "Java" to "Kava"      
		 System.out.println(replaceString);    
		
		 s ="zakir";
		 String newStr = s.replace('z', 'm');
		 System.out.println(" Z is Replaced M in zakir "+newStr);
		
		
	
		
	}

	private static void Reverse_Words_Also_Reverese_Chars_Using_StringBuilder() {
		StringBuilder 	sb 		=  new StringBuilder("apple boy cat");
		StringBuilder 	rev 		= sb.reverse();
		System.out.println(rev);
		
	}

	private static void Reverse_Words_Also_Reverese_Chars_Using_Forloop_and_StringBuilder() {
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

	private static void Reverse_Given_Statment() {
		
		String str = "bluestone means trust";
		String[] arr = str.split(" ");
		//Now taking each word from the given statement as String
		for(int i=arr.length-1; i>=0; i--)
		{
			
			System.out.print(arr[i]+ " " );
			
		}
		
		
		
		
	
		
	}

	private static void Reverse_Words_Also_Reverese_Chars_Using_ForLoop() {
		
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

	private static void Reverse_String_Using_String_Builder() {
		StringBuilder builder = new StringBuilder("Zakir");
		StringBuilder rev = builder.reverse();
		System.out.println(rev);		
	}

	private static void Reverse_String_Using_For_Loop() {
		String str = "Apple";
		String rev = "";
		int len = str.length();
		
		for( int i=len-1; i>=0; i--)
			{
				 rev = rev+ str.charAt(i);
			}
		System.out.println(rev);
		
		
	}

}
