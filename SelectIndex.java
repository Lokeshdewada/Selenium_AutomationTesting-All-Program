package BasicSelect.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectIndex {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
		//	driver.get("https://www.facebook.com/signup");
			driver.get("https://letcode.in/dropdowns");
//			  WebElement Month= driver.findElement(By.id("month"));
			 WebElement dropdown= driver.findElement(By.id("country"));
			  
			  Select s = new Select(dropdown);
			  //Select the element of an Index Start form 0
			  s.selectByIndex(6);
			  
	}

}
//SelectByIndex():
//*To Select element in dropdown
//*Return type is void
//*Index value start  from 0.
//*pass argumenet in the form of int.
//*we select the element on the bases of index value
//*