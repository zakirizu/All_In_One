package Java_Interview;

public class Reverse_String_Using_StringBuilder {

	public static void main(String[] args) {
		//Creating a string builder object with a String a parameter
		StringBuilder Builder = new StringBuilder("zakir");
		StringBuilder rev = Builder.reverse();
		System.out.println(rev);

	}
}

