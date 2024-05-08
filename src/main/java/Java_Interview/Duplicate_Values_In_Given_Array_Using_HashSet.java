package Java_Interview;

import java.util.HashSet;

public class Duplicate_Values_In_Given_Array_Using_HashSet {

	public static void main(String[] args) {
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

}
