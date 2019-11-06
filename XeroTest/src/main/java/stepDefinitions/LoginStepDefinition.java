package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.File;
import java.util.Random;




import org.apache.commons.io.FileUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;





public class LoginStepDefinition {
	
	static WebDriver driver;
	static String browsername="chrome";
	
	
	@Given("^user is already on login page$")
	public void user_is_already_on_login_page(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://www.xero.com/au/");	
//		driver.findElement(By.xpath("//input[@type='Login']")).click();
			driver.get("https://login.xero.com/");	
	}
	
	@When("^user enters username and enters password$")
	public void user_enters_username_and_enters_password() throws Throwable {
	   driver.findElement(By.name("userName")).sendKeys("gade.kavitha@gmail.com"); 
	   driver.findElement(By.name("password")).sendKeys("Password1"); 
	}

	@When("^user clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {
		driver.findElement(By.id("submitButton")).click();
	   
	   
	}

	@Then("^user is on Account Dashboard$")
	public void user_is_on_Account_Dashboard() throws Throwable {
	    String actualtitle =driver.getTitle();
		
	   
	}
	
	@And("^user clicks on Connect your bank accounts link$")
    public void user_clicks_on_connect_your_bank_accounts_link() throws Throwable {
		Thread.sleep(3000);
		//The below code is click on connect yourbank account link
        driver.findElement(By.linkText("Connect your bank accounts")).click();
        Thread.sleep(3000);
        //The below code is used to select a value "ANZ"
        driver.findElement(By.id("xui-searchfield-1018-inputEl")).sendKeys("ANZ");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='dataview-1025']/li")).click();
        //The below code is used to generate the randon number adding to the accname
        Random ra=new Random();
		int num =ra.nextInt(2000);
		String accname="firstname"+String.valueOf(num);
		Thread.sleep(4000);
		Actions action=new Actions(driver);
		action.click(driver.findElement(By.xpath("//input[@role='combobox']"))).sendKeys(Keys.TAB).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.name("accountname-1037-inputEl")).sendKeys(accname);
		Thread.sleep(4000);
		//The below code is send the acc number
		int accnum =ra.nextInt(20000);
         action.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(String.valueOf(accnum)).build().perform(); 
		Thread.sleep(4000);    
	    //The below code is click om cntinue button
	     driver.findElement(By.id("common-button-submit-1015")).click();
	     Thread.sleep(6000);
	     //The below  code is to do the asserton for the accnum
	     String value =driver.findElement(By.xpath("//*[@id='bankaccounts-root']/div/main/div/div/div[1]/div/div/div[2]")).getText();
	     
	     driver.findElement(By.xpath("//*[@id='bankaccounts-root']/div/main/footer/a/span")).click();
	     Thread.sleep(3000);
	     //The below code is click on Dashboard and taking screen for green color
	     driver.findElement(By.linkText("Dashboard")).click();
	     File fi =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(fi, new File("D:\\m1.png"));
		
    }


	
	
	
	

}
