package BasicSelect.java;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class test10 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
		WebElement men = driver.findElement(By.xpath("//span[text()='Men']"));
		
		
		
		Actions a = new Actions (driver);
	
		//step1: press control button
		a.keyDown(Keys.CONTROL).perform();
		Thread.sleep(2000);
		//step2:click on men
		a.click(men).perform();
		
		Thread.sleep(2000);
		
		//step3"Release control button
		a.keyUp(Keys.CONTROL);
		
		
		
	}

}
