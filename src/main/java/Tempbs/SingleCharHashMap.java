package Tempbs;

import java.util.HashMap;

public class SingleCharHashMap {

	public static void main(String[] args) {
		
		HashMap<Character, Integer> charmap = new HashMap<>();
		
		String str = "zakir hussain shaik";
		
		
		for(int i=0; i<str.length();i++)
		{
			char c = str.charAt(i);
			if(!charmap.containsKey(c))
			{
				charmap.put(c, 1);
			}
			else
			{
				int value = charmap.get(c);
				charmap.put(c, value+1);
			}
			
			
		}
		

//		
	
		
		

		

	}

}
