package BasicSelect.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class deSelectAll {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		   driver.get("https://letcode.in/test");   
		  driver.findElement(By.xpath("//a[text()='Drop-Down']")).click();
		  //WebElement dropdown= driver.findElement(By.id("Select Fruit"));
		   Thread.sleep(2000);
		   WebElement seconddropdown = driver.findElement(By.id("superheros"));
		   Thread.sleep(2000);
		    
		   Select s = new Select(seconddropdown );
		   s.selectByVisibleText("Batwoman");
		   s.selectByVisibleText("Ghost Rider");
		   s.selectByVisibleText("Thor");
		   Thread.sleep(2000);
		   s.deselectAll();
	}

}
