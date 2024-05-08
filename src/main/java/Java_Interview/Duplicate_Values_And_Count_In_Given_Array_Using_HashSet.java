package Java_Interview;

import java.util.HashSet;

public class Duplicate_Values_And_Count_In_Given_Array_Using_HashSet {

	public static void main(String[] args) {
		
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

}
