package BasicSelect.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Letcodedropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		   driver.get("https://letcode.in/test");   
		  driver.findElement(By.xpath("//a[text()='Drop-Down']")).click();
		  WebElement dropdown= driver.findElement(By.id("Select Fruit"));
		   
//		   Select s = new Select(dropdown);
//		   //System.out.println(s.isMultiple());  
//		   s.selectByVisibleText("Pine Apple");
		  
	}

}
