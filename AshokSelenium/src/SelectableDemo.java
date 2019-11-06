import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class SelectableDemo extends MouseHoverActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		setup();
		objname.get("http://jqueryui.com/selectable/");
		objname.switchTo().frame(0);
		WebElement item1=objname.findElement(By.xpath(".//*[@id='selectable']/li[1]"));
		WebElement item4=objname.findElement(By.xpath(".//*[@id='selectable']/li[4]"));
		WebElement item5=objname.findElement(By.xpath(".//*[@id='selectable']/li[5]"));
		WebElement item6=objname.findElement(By.xpath(".//*[@id='selectable']/li[6]"));
		
		Actions action=new Actions(objname);
		action.keyDown(Keys.CONTROL).click(item1).click(item4).click(item5).click(item6).perform();
		action.keyUp(Keys.CONTROL).perform();
		objname.close();
		objname.findElement(By.id("")).click();
	}

}
