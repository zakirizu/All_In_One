package java_Interview;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class CountOfChars {

	public static void main(String[] args) {
	String given  	= "SOFTWARE ENGINEERS";
	String str		= (given.replace(" ", "")).toLowerCase();
	
	
	/**************************LOGIC***************************
	 *  Map Keys - Unique, can contain one null value
	 *  values can be duplicate
	 * ********************************************************
	 */
	
	//Declaring HashMap
	HashMap<Character, Integer> hmap = new HashMap<Character,Integer>();
	for(int i =0; i<str.length(); i++)
	{
		char key = str.charAt(i);
		if(!hmap.containsKey(key))
		{
			hmap.put(key,1);
		}
		else
		{
		int value = hmap.get(key);
		hmap.put(key, value+1);		
		}
		
	}
	
	Iterator<Character> keyiter = hmap.keySet().iterator();
	Iterator<Integer> Valueite  = hmap.values().iterator();
	
	while(keyiter.hasNext() && Valueite.hasNext())
	{
		
		System.out.println(keyiter.next() + " -> "+Valueite.next());
		
	}	


	}

}
