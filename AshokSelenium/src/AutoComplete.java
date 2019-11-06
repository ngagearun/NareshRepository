import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class AutoComplete extends MouseHoverActions{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		setup();

		objname.navigate().to("http://jqueryui.com/autocomplete/");
		objname.switchTo().frame(objname.findElement(By.className("demo-frame")));
		objname.findElement(By.id("tags")).sendKeys("S");
		
		WebElement autocomplete= objname.findElement(By.id("ui-id-1"));
		List<WebElement> list=autocomplete.findElements(By.xpath("li/div"));		
		System.out.println(list.size());
		for(int i=0;i<list.size();i++){
			String value=list.get(i).getText();
			if(value.equalsIgnoreCase("BASIC")){
				list.get(i).click();
				break;
			}
		}
		objname.close();
	}

}
