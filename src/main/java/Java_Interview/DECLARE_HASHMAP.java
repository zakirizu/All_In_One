package Java_Interview;

import java.util.HashMap;
import java.util.Iterator;

import org.apache.commons.collections4.map.HashedMap;

public class DECLARE_HASHMAP extends ZCOLORS_PRINT{

	public static void main(String[] args) {
		
		HashMap<String, Integer> hmap = new HashMap<String, Integer>();
		hmap.put("apple", 10);
		hmap.put("boy", 20);
		hmap.put("cat", 30);
		
		System.out.println(BLUE +hmap);
			
		
		//Printing  using ForEachLoop		
		for(String k : hmap.keySet())		{
			System.out.println(RED+k    + "->"    +hmap.get(k));			
		}
		
		
		//Print Using For Iterator
		Iterator<String> keyIte 		= hmap.keySet().iterator();
		Iterator<Integer> valueIte 	= hmap.values().iterator();
		
		while(keyIte.hasNext() && valueIte.hasNext())
		{
			System.out.println(GREEN +keyIte.next() +"->"+ +valueIte.next());
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
