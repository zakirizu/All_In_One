package FrameWork_BuildingBlocks;

import org.apache.logging.log4j.*;


public class log4JDemo {
	/***********************************************************************
	 * If you could see only message insider .error is displayed 
	 * message inside the info, fatal & debug is not displayed 
	 * In order to system display the message inside the info we need to make some configurations
	 * We can configure what needs to be printed in the console from the xml file which we have downloaded from the apache file
	 * Please refer the video with link: https://www.youtube.com/watch?v=ViJxlwdL9m4&ab_channel=SoftwareTestingMentor
	 * *********************************************************************/

			
	
	private static Logger demoLogger = LogManager.getLogger(log4JDemo.class.getName());
	
	public static void main(String[] args) {
		demoLogger.info("Message in Info");
		demoLogger.error("Message in Error");
		demoLogger.debug("Message in Debug");
		demoLogger.fatal("Message in Debug");
}


}
