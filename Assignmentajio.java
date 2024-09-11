package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignmentajio {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.name("searchVal")).sendKeys("watches");
		driver.findElement(By.className("ic-search")).click(); )
        Thread.sleep(3000);
      driver.findElement(By.xpath("//label[text()='Men (8,209)']")).click();
    //    System.out.println(select);
        
        
   }
}