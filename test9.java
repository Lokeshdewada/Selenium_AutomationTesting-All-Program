package BasicSelect.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class test9 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		
		Thread.sleep(2000);
		
		WebElement home = driver.findElement(By.xpath("(//a[text()='Home & Living'])[1]"));
		
		
		Actions  a = new Actions(driver);
		a.moveToElement(home);
		//a.build();  //selenium 3 version to build actions class element to perform action
		a.perform();
		
		
		
		}

}
