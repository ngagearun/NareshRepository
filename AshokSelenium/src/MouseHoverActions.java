import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class MouseHoverActions {

	static WebDriver objname;
	
	static Select select;
	
	public static void setup(){
		
		objname =new FirefoxDriver();
		objname.manage().window().maximize();
		objname.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		setup();
		objname.navigate().to("https://www.flipkart.com/");
		Actions action=new Actions(objname);
		action.moveToElement(objname.findElement(By.linkText("Electronics"))).perform();
		objname.findElement(By.linkText("Samsung")).click();
		objname.findElement(By.xpath(".//*[@id='container']/div/div[1]/div/div/div[3]/div/div/div[1]/div[1]/div/div/a")).click();
		select=new Select(objname.findElement(By.xpath("//div/div/div[2]/section/div[4]/div[1]/select")));
		select.selectByIndex(3);
		Thread.sleep(30000);
		select.selectByValue("20000");
		Thread.sleep(30000);
		objname.close();
		
		
	}

}
