package HandlingRadioBtn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		int count=driver.findElements(By.xpath("//input[@type='radio']")).size();
		System.out.println("no of radio btn is  "+count);
	}

}
