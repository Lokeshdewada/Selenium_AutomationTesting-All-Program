package webdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver c=new ChromeDriver();
		c.manage().window().maximize();
		c.get("https://www.myntra.com/");
		Thread.sleep(2000);
		c.findElement(By.className("desktop-searchBar")).sendKeys("backpack"+Keys.ENTER);
		Thread.sleep(4000);
		c.findElement(By.xpath("//img[@src='https://assets.myntassets.com/dpr_2,q_60,w_210,c_limit,fl_progressive/assets/images/12361350/2023/12/15/969b9ab1-3af4-458e-a8ca-34944b7b3bd31702640584507-Wildcraft-Unisex-Lunar-Backpack-8941702640584282-14.jpg']")).click();
		
		Set<String> tab=c.getWindowHandles();
		System.out.println("tab ids: "+tab);
		
		String title1=c.getTitle();
		System.out.println("title: "+title1);
		System.out.println("=========================================");
		String url1=c.getCurrentUrl();
		System.out.println("url: "+url1);
		System.out.println("=========================================");
		
		
		for(String str:tab) 
		{
			String title=c.switchTo().window(str).getTitle();
			System.out.println(title);
			if(title.contains("Buy Wildcraft Unisex Lunar Backpack  - Backpacks for Unisex 12361350 | Myntra")) 
			{
				
			}
		}
		Thread.sleep(2000);
		//child window
		c.findElement(By.xpath("//div[text()='ADD TO BAG']")).click();
		Thread.sleep(2000);
	   	c.findElement(By.xpath("//span[text()='GO TO BAG']")).click();
	   	Thread.sleep(2000);
	   	
	   	for(String b:ids) {
	   		
	   	}
	
	}
}