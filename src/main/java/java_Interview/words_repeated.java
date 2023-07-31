package java_Interview;

public class words_repeated {

	public static void main(String[] args) {
		String str = "My trainer is zakir and zakir is from kurnool. zakir loves to swim and loves cricket";
		String wordToCount = "zakir";
		int count = 0;

		String[] words = str.split(" ");
		for (String word : words) {
		    if (word.equalsIgnoreCase(wordToCount)) {
		        count++;
		    }
		}

		System.out.println("The word \"" + wordToCount + "\" appears " + count + " times in the string.");


	}

}
