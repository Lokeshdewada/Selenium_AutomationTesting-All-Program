package BasicSelect.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		  WebElement Month= driver.findElement(By.id("month"));
		  Select s = new Select(Month);
		  s.selectByValue("1");
		  
	}
	}
//SelectByvalue():
//*To Select element in dropdown
//*Return type is void
//*pass argumenet in the form of string
//*we select the elementon the bases of Attribute value 