package BasicActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions1 {

	private static WebElement MEN;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // To perform mouse action 
		//action class have 21 method
		//Action is a concrete class of selenium
		//Its perform keyword and mouse gesture
		//1.Mouse Hovering
		//2.key up
		//3.key down
		//4.Double click
		//5.Drag and Drop
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
		
		//Step 1. Identify the webselement
//	WebElement  men  = 	driver.findElement(By.xpath("//span[text()='MEN']"));
		WebElement women = driver.findElement(By.xpath("//span[text()='WOMEN']"));
		
		//step2  Create theobject of action class
		//step3 Pass webdriver reference as an argument to action constructer
		Actions L= new Actions(driver);
		
		//Step4. Mouse hover on men
		//L.moveToElement(men);
		L.moveToElement(women);
		
		//step5 call perform()
		L.perform();
		
		
	}

}
