package selenium_Interview;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tiltle_Of_Page {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();

driver.get("https://www.apsrtconline.in/oprs-web/");
String title = driver.getTitle();
System.out.println("Title of the Page = "+title);
Thread.sleep(10000);
driver.quit();


/*
 * 
// class name is x 
//WebDriver is an interface 
// then to create a object for class x , below is the syntax
// X Driver = new X();
//Webdriver is an interface 
		
 * 
 * 
 * 
 * driver.close - This method closes the browser window on which the focus is set. Despite the familiar name for this method, WebDriver does not implement the AutoCloseable interface.

driver.quit � This method basically calls driver.dispose a now internal method which in turn closes all of the browser windows and ends the WebDriver session gracefully.

driver.dispose - As mentioned previously, is an internal method of WebDriver which has been silently dropped according to another 
answer - Verification needed. This method really doesn't have a use-case in a normal test workflow as either of the previous methods should work for most use cases.
*/
}

}
