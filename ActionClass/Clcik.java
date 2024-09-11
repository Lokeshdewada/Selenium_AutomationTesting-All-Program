package BasicActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Clcik {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		
		//Step 1. Identify the webselement
		WebElement  bag =   driver.findElement(By.xpath("//span[text()='Bag']"));
		Actions a = new Actions(driver);
		//click on the webpage - click()
		//a.click();
		//clicking on bag-  click (webelement target)
		a.perform();
		a.click(bag);
		
		
				
		
	}

}
