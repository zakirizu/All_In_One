package Java_Interview;

public class String_Functions {
	static String s = "Sachin ";
	public static void main(String[] args) {
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
		
		 String s ="zakir";
		 String newStr = s.replace('z', 'm');
		 System.out.println(" Z is Replaced M in zakir "+newStr);
		
		
	}

}
