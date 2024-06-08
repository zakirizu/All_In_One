package Java_Interview;

import java.util.HashSet;
import java.util.Iterator;

public class DECLARE_HASHSET extends ZCOLORS_PRINT {

	public static void main(String[] args) {
		
		HashSet<String> hset = new HashSet<String>();
		hset.add("apple");
		hset.add("boy");
		hset.add("cat");
		
		
		//Print Using For Each Loop
		for(String s : hset)
		{
			System.out.println(RED +s);
		}
		
		//Print using Iterator
		Iterator<String> ite = hset.iterator();
		while(ite.hasNext())
		{
			System.out.println(GREEN+ ite.next());
		}
		
		//Print hset
		System.out.println(BLUE +hset);
		
		
		
	
		
		
		
		

	}

}
