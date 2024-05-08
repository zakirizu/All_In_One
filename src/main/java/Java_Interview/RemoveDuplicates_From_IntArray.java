package Java_Interview;

import java.util.HashSet;
import java.util.Iterator;

public class RemoveDuplicates_From_IntArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,2,3,4,4,2,8,1};
        HashSet<Integer> hset = new  HashSet<Integer>();
        for(int i=0;i<arr.length; i++)
        {
            hset.add(arr[i]);
        }
        
        Iterator ite = hset.iterator();
        while(ite.hasNext())
        {
            System.out.println(ite.next());
        }

	}

}
