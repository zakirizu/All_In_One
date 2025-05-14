package Java_Interview;

public class Pattern_In_Java {
	
    public static void main(String[] args) {
        int rows = 9; // You can change the number of rows as per your requirement

        for (int i = 1; i <= rows; i++) {        	
        	   // Print numbers in ascending order
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
                     }
            // Print numbers in descending order
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println(); // Move to the next line after each row
            i++;
        }
    }
}


