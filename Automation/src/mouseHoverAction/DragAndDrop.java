package mouseHoverAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		
	WebElement src=driver.findElement(By.id("draggable"));
	WebElement dest=driver.findElement(By.id("droppable"));
	
	Actions act=new Actions(driver);
	act.dragAndDrop(src, dest).build().perform();
	}

}
