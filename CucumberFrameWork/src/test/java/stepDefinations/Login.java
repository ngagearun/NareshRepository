package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Login {
	
	WebDriver driver;
	
	@Given("the user is on mortagecalculator homepage")
	public void the_user_is_on_mortagecalculator_homepage() {
	    

		System.setProperty("webdriver.chrome.driver",  System.getProperty("user.dir")+"/chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mortgagecalculator.org/");
	}


    @Then("^enter the (.+) (.+) (.+) details$")
    public void enter_the_details(String homevalue, String downpayment, String inteestrate) throws Throwable {
		
		driver.findElement(By.name("param[homevalue]")).clear();
		Thread.sleep(3000);
		driver.findElement(By.name("param[homevalue]")).sendKeys(homevalue);
		driver.findElement(By.id("loanamt")).clear();
		Thread.sleep(3000);
		driver.findElement(By.id("loanamt")).sendKeys(downpayment);
		driver.findElement(By.id("intrstsrate")).clear();
		Thread.sleep(3000);
		driver.findElement(By.id("intrstsrate")).sendKeys(inteestrate);
		
	   
	}

	@Then("click on calculate button")
	public void click_on_calculate_button() {
		driver.findElement(By.name("cal")).click();
		driver.close();
	}

}
