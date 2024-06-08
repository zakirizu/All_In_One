package Java_Interview;

import java.util.ArrayList;

public class DECLARE_ARRAY_LIST  extends ZCOLORS_PRINT{


	

	public static void main(String[] args) {
		//Retains the order in which we are placing the elements
		
		
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("apple");
		arr.add("boy");
		arr.add("cat");
		arr.add("dog");
		
//
		
		//Printing using for loop
		System.out.println(BLUE + "--Print Array Using For  Loop-----------------------------------------------------------------" );
		for(int i=0; i<arr.size();i++)
		{
			System.out.println(arr.get(i));
		}
		

		
		//Printing Using the For Each Loop
		System.out.println(RED + "--Print Array Using For Each Loop-----------------------------------------------------------------" );
		for(String s: arr)
		{
			System.out.println(s);
		}
		
		
		System.out.println(GREEN + "--Print Array Values Direclty-----------------------------------------------------------------" );
		System.out.println(arr);
		

		
	}

}
