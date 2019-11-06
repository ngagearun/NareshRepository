import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.remote.DesiredCapabilities;


public class WindowBasedHandlingDemo {

	public static void main(String[] args) throws IOException {
	;
		
		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);
		
		driver.get("http://only-testing-blog.blogspot.in/");
		driver.findElement(By.xpath(".//*[@id='post-body-4105674242499183386']/div[1]/form/input[10]")).click();
		Runtime.getRuntime().exec("C:\\Users\\Lenovo\\Desktop\\Anuradha.exe");
			}

}
