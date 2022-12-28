package selenium_Interview;


import java.util.Set;		
import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
		

public class Windows_Select_LastButOne {				

    public static void main(String[] args) throws InterruptedException {									
    	System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
    	WebDriver driver=new ChromeDriver();			
        		
     //Launching the site.				
        driver.get("http://demo.guru99.com/popup.php");			
        driver.manage().window().maximize();	                		
        driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();
        driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();        		
        String MainWindow=driver.getWindowHandle();		
        		
  // To handle all new opened window.				
       Set<String> s1=driver.getWindowHandles();
       Object[] WindowsArray 	= s1.toArray();
       int len 					= WindowsArray.length;
       System.out.println(len);
       
       driver.switchTo().window((String) WindowsArray[2]);
       Thread.sleep(4000);
       driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("BlueStone");
       Thread.sleep(4000);
       driver.switchTo().window(MainWindow);
       Thread.sleep(4000);
       driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();
       Thread.sleep(4000);
       driver.quit();
      

       
        
        
        
       
        // Switching to Parent window i.e Main Window.
            driver.switchTo().window(MainWindow);				
    }
}	