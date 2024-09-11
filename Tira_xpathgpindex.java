package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tira_xpathgpindex {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver c=new ChromeDriver();
		c.manage().window().maximize();
		Thread.sleep(2000);
		c.get("https://www.tirabeauty.com/");
	    WebElement a  = 	c.findElement(By.id("search"));
	//typing in search on tf
		a.sendKeys("Perfume");
		// clicking on neter botton
		a.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		a.findElement(By.xpath("(//div[@class='product-name'])[1])")).click();
		
	}

}

//