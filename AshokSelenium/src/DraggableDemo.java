import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;


public class DraggableDemo extends MouseHoverActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		setup();
		objname.navigate().to("http://jqueryui.com/draggable/");
		objname.switchTo().frame(objname.findElement(By.className("demo-frame")));
		Actions action=new Actions(objname);
		action.dragAndDropBy(objname.findElement(By.id("draggable")),47 , 113).perform();
		objname.close();
	}

}
