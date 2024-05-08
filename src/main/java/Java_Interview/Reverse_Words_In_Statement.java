package Java_Interview;

public class Reverse_Words_In_Statement {

	public static void main(String[] args) {
		//break the words into Array of String by spaces - Then print all the arrays in reverse order
				String str = "Blessed Bluestone means commitment Bluestone Helpline";
				String[] StrArr = str.split(" ");		
				int len = StrArr.length;
				System.out.println("Cound of words ="+len);
				for(int i=len-1; i>=0;i--)
				{		
				System.out.print(StrArr[i]+" ");		
				}
					
			}

	}


