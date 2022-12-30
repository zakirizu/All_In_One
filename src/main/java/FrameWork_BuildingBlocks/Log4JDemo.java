package FrameWork_BuildingBlocks;

import org.apache.logging.log4j.*;


public class Log4JDemo {
	/***********************************************************************
	 * If you could see only message insider .error is displayed 
	 * message inside the info, fatal & debug is not displayed 
	 * In order to system display the message inside the info we need to make some configurations
	 * We can configure what needs to be printed in the console from the xml file which we have downloaded from the apache file
	 * Please refer the video with link: https://www.youtube.com/watch?v=ViJxlwdL9m4&ab_channel=SoftwareTestingMentor
	 * *********************************************************************/

			
	
	public static Logger myLoggger =LogManager.getLogger(Log4JDemo.class.getName());
	
	public static void main(String[] args) {
		myLoggger.info("Message in Info");
		myLoggger.error("Message in Error");
		myLoggger.debug("Message in Debug");
		myLoggger.fatal("Message in Debug");
		

}



}
