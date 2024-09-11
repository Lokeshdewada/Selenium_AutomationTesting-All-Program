package assignment;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverTiraBeauty {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.tirabeauty.com");
		WebElement frag=wd.findElement(By.linkText("Fragrance"));

		Actions hover= new Actions(wd);
		hover.moveToElement(frag);
		hover.perform();
		Thread.sleep(2000);
		wd.findElement(By.xpath("(//a[text()=' Perfume (EDT & EDP) '] )[2]")).click();
		
		JavascriptExecutor js=(JavascriptExecutor) wd;
		for(; ;)
		{
			try {
				wd.findElement(By.cssSelector("img[alt='Calvin Klein | Calvin Klein Be Eau De Toilette (100ml)']")).click();
				break;
			}
			catch(NoSuchElementException e)
			{
				js.executeScript("window.scrollBy(0,200)");
				Thread.sleep(2000);
			}			
		}
		
		Set<String> tabId=wd.getWindowHandles();
		for(String s: tabId)
		{
			String url=wd.switchTo().window(s).getCurrentUrl();
			if(url.contains("https://www.tirabeauty.com/product/calvin-klein-be-eau-de-toilette-100ml-ngquww18fxie"))
			{
				break;
			}
		}
		
		wd.findElement(By.xpath("//span[text()='Add to Bag']")).click();
		Thread.sleep(2000);
		wd.findElement(By.cssSelector("img[alt='cart icon']")).click();
		
	}

}