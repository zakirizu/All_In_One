package FrameWork_BuildingBlocks;

public class TimeTakenDemo {

	public static void main(String[] args) {
		double startTime	= System.currentTimeMillis();
		double endTime = System.currentTimeMillis();
		System.out.println("Total Execution Time:" + String.format("%.3f", ( endTime- startTime)/1000/60F )+" Minutes");
		System.out.println();
		
		  final String ANSI_RESET = "\u001B[0m"; 
		  final String ANSI_BLACK = "\u001B[30m"; 
		  final String ANSI_RED = "\u001B[31m"; 
		  final String ANSI_GREEN = "\u001B[32m"; 
		  final String ANSI_YELLOW = "\u001B[33m"; 
		  final String ANSI_BLUE = "\u001B[34m"; 
		  final String ANSI_PURPLE = "\u001B[35m"; 
		  final String ANSI_CYAN = "\u001B[36m"; 
		  final String ANSI_WHITE = "\u001B[37m"; 
		  System.out.println(ANSI_RED + "This text is red!" + ANSI_RESET); 
		
		
		
		
	    }
	}


