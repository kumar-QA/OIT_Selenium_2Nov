package HandlingRadioBtn;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioBtnName {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
List<WebElement>elements=driver.findElements(By.xpath("//input[@type='radio']"));
		
   for (int i = 0; i < elements.size(); i++) {
	   
	  String data=elements.get(i).getAttribute("value");
	  System.out.println("Radio Btn name is  "+data);
}
 
     for (WebElement ele : elements) {
    	 System.out.println(ele.getAttribute("value"));
		
	}
 

	}

}
