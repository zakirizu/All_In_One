package Java_Interview;

import java.util.ArrayList;
import java.util.HashSet;

public class First_Unique_Number_NOT_DONE {

	public static void main(String[] args) {

/*

input1 = {2,3,5,7,8,2,9,4,4,3,7,89,8,5,1,11}
output1 = 1

input2 = {2,3,5,7,8,2,4,4,3,7,9,8,1,5,9,11, 1, 11}
output1 = "No unique number"
 */
		int[] input1 = {2,3,5,7,8,2,4,4,3,7,9,8,5,1,9,11};
		HashSet<Integer> hset = new HashSet<Integer>();
		
		for(int i=0; i<input1.length;i++)
		{
			for(int j=i+1; j < input1.length; j++)
			
			
			
			if(!hset.contains(input1[i]))
			{
				hset.add(input1[i]);
			}
			
			
		}
		
		
		
		
		
		

	}

}
