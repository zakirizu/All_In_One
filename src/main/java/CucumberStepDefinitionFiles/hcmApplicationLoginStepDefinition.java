package CucumberStepDefinitionFiles;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class hcmApplicationLoginStepDefinition {
WebDriver driver;
	@Given("Launch HCM Url Application")
	public void launchHCMUrlApplication() {		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	}
	
	
	@Given("Launch HCM Application")
	public void LaunchHCMApplication() {
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	@When("^Login with (.+) and (.+)$")
	public void loginWithUserIdandPassword(String userID, String passWord) {
		WebElement uid = driver.findElement(By.xpath("//input[@name='username']"));
		WebElement pwd = driver.findElement(By.xpath("//input[@name='password']"));
		WebElement sbt = driver.findElement(By.xpath("//button[@type='submit']"));
		uid.sendKeys(userID);
		pwd.sendKeys(passWord);
		sbt.click();
	}
	
	   @Then("^wait for sometime and close$")
	    public void wait_for_sometime_and_close() throws Throwable {
	        Thread.sleep(3000);
	        driver.close();
	    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
