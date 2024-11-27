package Java_Interview;

class try_Catch_FInally{
	   public static void main(String args[]){
	     try{
	        System.out.println("statment1");
	        int num=90/0;
	        System.out.println(num);
	     }
	//     catch(ArrayIndexOutOfBoundsException e){
	    	 	     catch(Exception  e){
	        System.out.println("ArrayIndexOutOfBoundException");
	     }
	     finally{
	        System.out.println("finally block");
	     }
	     System.out.println("Out of try-catch-finally block");
	   }
	}