package Java_Interview;
import java.util.HashSet;
import java.util.HashSet;

public class ALPHA {

	public static void main(String[] args) {
		
		//Reverse 

	
	
		
		//Duplicate 
	Duplicate_Values_In_Given_Array_Using_ForLoop();

	Duplicate_Values_And_Count_In_Given_Array_Using_HashSet();
		
		
		
		
	}

		
	private static void Duplicate_Values_And_Count_In_Given_Array_Using_HashSet() {}
			
		





	private static void Duplicate_Values_In_Given_Array_Using_ForLoop() {
		String[] names = {"zakir", "hussain","zakir", "shaik"};
		for(int i =0; i<names.length; i++)
		{
			for(int j=i+1; j<names.length;j++)
			{
				if(names[i].equalsIgnoreCase(names[j]))
				{
					System.out.println("Duplicate values is "+names[i]);
				}
				
			}
			
			
			
		}
		
	}



}



