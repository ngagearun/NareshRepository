import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;


public class MultipleWindowHanding extends MouseHoverActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		setup();
		objname.navigate().to("https://www.bing.com/");
		String parent_window =objname.getWindowHandle();
		objname.findElement(By.linkText("MSN")).click();
		Set<String> windows =objname.getWindowHandles();
		Iterator<String> itr=windows.iterator();
		while(itr.hasNext()){
			String windowname =itr.next();
			if(!windowname.equals(parent_window)){
				objname.switchTo().window(windowname);
				objname.findElement(By.xpath(".//*[@id='q']")).sendKeys("Selenium");
				objname.close();
			}
		}
		objname.switchTo().window(parent_window);
		objname.findElement(By.xpath(".//*[@id='sb_form_q']")).sendKeys("Selenium");
		objname.close();

	}

}
