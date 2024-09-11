package assignment;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchMyntra {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com");
		driver.findElement(By.className("desktop-searchBar")).sendKeys("Wallet");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("span[class='myntraweb-sprite desktop-iconSearch sprites-search']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='Men']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='myntraweb-sprite filter-search-iconSearch sprites-search'][1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("div[class='brand-more']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[class='FilterDirectory-searchInput']")).sendKeys("Ducati");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='Ducati']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("span[class='myntraweb-sprite FilterDirectory-close sprites-remove']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@class='img-responsive'][1]")).click();
		
		//findOut the how many tabs open
		Set<String> tabId=driver.getWindowHandles();
//		String url=driver.getCurrentUrl();
		for(String s: tabId)
		{
		  driver.switchTo().window(s).getCurrentUrl();		  
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='ADD TO BAG']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Bag']")).click();
	}

}