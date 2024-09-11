package BasicSelect.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByVisualtext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		   driver.get("https://www.facebook.com/signup");   
		   WebElement Month= driver.findElement(By.id("month"));
		   Select s = new Select(Month);
		   s.selectByVisibleText("Sep");
		   
	}

}
//SelectByVisibleText():
//	*To Select element in dropdown
//	*Return type is void
//	*pass argumenet in the form of string
//	*we select the elementon the bases of text