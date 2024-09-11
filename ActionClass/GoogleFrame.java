package BasicActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleFrame {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.findElement(By.className("gb_d")).click();
		
		//driver.switchTo().frame("app");
		WebElement a = driver.findElement(By.cssSelector("iframe[scrolling='no']"));
		
		driver.switchTo().frame(a);
		//To click on youtube text
		driver.findElement(By.xpath("//span[text()='YouTube']")).click();
		
		}

}


//1. check Targeted webelement is pesent inside the frame 
//2. Transfer the driver control to the frame
//3. Identify the targeted WebEleemnt by using Findelemt() or findelements() and  perform the action 
