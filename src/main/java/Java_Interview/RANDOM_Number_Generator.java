package Java_Interview;

import java.util.concurrent.ThreadLocalRandom;

public class RANDOM_Number_Generator {

	public static void main(String[] args) {
		int rand = ThreadLocalRandom.current().nextInt();
		System.out.println("Random Integers: " + rand);
		

	}

}
