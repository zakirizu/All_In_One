package java_Interview;

import java.util.HashSet;

public class JAVA_INTERVIEW_QUESTIONS {

	public static void main(String[] args) {
		//Java_01_Reverse_Given_String_Using_For_loop(); 			
		//Java_02_Reverse_String_Using_StringBuilder();		
		Java_03_Reverse_Words_In_Statement();	
		//Java_04_Reverse_Words_Also_Reverese_Chars_In_Statement_Using_ForLoop();
		//Java_05_Reverse_Words_Also_Reverese_Chars_In_Statement_Using_StringBUilder();
		//Java_06_Duplicate_Values_In_Given_Array_Using_ForLoop();
		//Java_07_Duplicate_Values_In_Given_Array_Using_HashSet();
		//Java_0_Duplicate_Values_And_Count_In_Given_Array_Using_HashSet();
		
		
	}

		
	private static void Java_0_Duplicate_Values_And_Count_In_Given_Array_Using_HashSet() {
		
		String str = "aaple";

		//Creating a Char Array of Charecters 	
		char[] GivenArray = str.toCharArray();	

		//Creating a HashSet from given word and adding to an array
		HashSet<Character> hs = new HashSet<Character>();
		for(int i=0;i<str.length();i++)
		{
			hs.add(GivenArray[i]);
			
		}
		System.out.println(hs);
		Object[] UniqueArray = hs.toArray();

		//verifying the duplicate values
		int count=0;
		int UniqueCharsCount=0;
		for(int i=0;i<UniqueArray.length;i++)
		{
			for(int j=0;j<GivenArray.length;j++)
			{
				if(UniqueArray[i].equals(GivenArray[j]))
				{
					count++;
				}
			}
			if(count%2!=0)
			{
				UniqueCharsCount++;
			}
			System.out.println(" "+UniqueArray[i]+" is Repeated "+count +" Times");
			count = 0;
		}

		if(UniqueCharsCount>1)
		{System.out.println("Cannot Create a Palendrome with Given String "+str);}
		else
		{System.out.println("Can Create a Palendrome with Given String "+str);}
			

	}
			
		


	private static void Java_07_Duplicate_Values_In_Given_Array_Using_HashSet() {
		String str ="papple";
		int count = 1;
		str.toLowerCase();
		char[] chArr = str.toCharArray();
		HashSet<Character> hs = new HashSet<Character>();
		
		for(char Temp: chArr)
		{
			if(hs.add(Temp)==false)
				
			{
				count = count+1;
				
				System.out.println("Duplicate Value is "+Temp );				
				System.out.println("Count repeated is "+count );
			}
			count =0;
		}

	}



	private static void Java_06_Duplicate_Values_In_Given_Array_Using_ForLoop() {
		String[] names = {"zakir", "hussain","zakir", "shaik"};
		for(int i =0; i<names.length; i++)
		{
			for(int j=i+1; j<names.length;j++)
			{
				if(names[i].equalsIgnoreCase(names[j]))
				{
					System.out.println("Duplicate values is "+names[i]);
				}
				
			}
			
			
			
		}
		
	}



	private static void Java_05_Reverse_Words_Also_Reverese_Chars_In_Statement_Using_StringBUilder() {
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






	private static void Java_04_Reverse_Words_Also_Reverese_Chars_In_Statement_Using_ForLoop() {
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



	private static void Java_03_Reverse_Words_In_Statement() {
		//break the words into Array of String by spaces - Then print all the arrays in reverse order
		String str = "Blessed Bluestone means commitment Bluestone Helpline";
		String[] StrArr = str.split(" ");		
		int len = StrArr.length;
		System.out.println("Cound of words ="+len);
		for(int i=len-1; i>=0;i--)
		{		
		System.out.print(StrArr[i]+" ");		
		}
			
	}
	


	private static void Java_02_Reverse_String_Using_StringBuilder() {
		//Creating a string builder object with a String a parameter
		StringBuilder Builder = new StringBuilder("zakir");
		StringBuilder rev = Builder.reverse();
		System.out.println(rev);
	}


	public static void Java_01_Reverse_Given_String_Using_For_loop() {
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
 

