package selenium_Interview;

import java.io.File;
import java.time.Duration;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
		driver.get(null);
		TakesScreenShot("WikiPedia_Bismillah");
	}

	private static void TakesScreenShot(String string) {
	//Taking the Screen Shot
	
	//Convert web driver object to TakeScreenshot
		TakesScreenshot screenShot = ((TakesScreenshot)driver);

    //Call getScreenshotAs method to create image file
       File SrcFile=screenShot.getScreenshotAs(OutputType.FILE);

    //Move image file to new destination
        String  DestFile = "C:\\\\Users\\\\Administrator\\\\eclipse-workspace\\\\learning\\\\ScreenShots\"+string+\".jpg";
         

    //Copy file at destination - IMPORTANT
    //     FileUtils.copyFile(SrcFile, DestFile);
		
	
	
	}

}
