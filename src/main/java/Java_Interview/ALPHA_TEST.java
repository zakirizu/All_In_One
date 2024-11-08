package Java_Interview;

import java.util.Random;

public class ALPHA_TEST {

	 static public void main(String[] args) {
		// TODO Auto-generated method stub
	        Random random = new Random();
	        long randomNumber = 1_000_000_000L + random.nextLong();	         
	        String  x = Long.toString(randomNumber);
	        String  temp = x.replaceAll("-", "");
	        System.out.println(temp);
	        

	}

}
