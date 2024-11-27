package Java_Interview;

public class Count_OF_VOWELS {

	public static void main(String[] args) {
		String str = "aeiou";


		int count = 0;

		for(int i=0;i<str.length(); i++)
		{
		char ch = str.charAt(i);

		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
		{
		count = count+1;

		}
		}

		System.out.print("Count of vowels is "+count);
	}

}
