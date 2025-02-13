package Java_Interview;
import java.util.HashMap;
import java.util.Iterator;
public class COUNT_OF_CHARS {
	public static void main(String[] args) {
	String given  	= "cotiviti";
	String str		= (given.replace(" ", "")).toLowerCase();	
	/**************************LOGIC***************************
	 *  Map Keys - Unique, can contain one null value
	 *  values can be duplicate
	 * ******************************************************** */
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
		//if it is already present then get the value of that key and then add one to that value as it has repeated for the second time
		int value = hmap.get(key); 
		hmap.put(key, value+1);		
		}
	}
	//Printing the values
	for(Character k : hmap.keySet())
	{
		System.out.println(k     +"->" +hmap.get(k) );
	}
	
	
	
	
//	
//	Iterator<Character> keyiter = hmap.keySet().iterator();
//	Iterator<Integer> Valueite  = hmap.values().iterator();
//	
//	while(keyiter.hasNext() && Valueite.hasNext())
//	{
//		System.out.println(keyiter.next() + " -> "+Valueite.next());
//	}	
//
//
//	
	}

}
