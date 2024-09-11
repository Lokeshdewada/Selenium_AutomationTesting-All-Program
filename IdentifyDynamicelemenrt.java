package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdentifyDynamicelemenrt {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		ChromeDriver c=new ChromeDriver();
//		c.manage().window().maximize();
//		Thread.sleep(2000);
//		c.get("https://www.flipkart.com/");
//		Thread.sleep(2000);
//	    WebElement a  = c.findElement(By.className("Pke_EE"));
//	//typing in search on tf
//		a.sendKeys("realme 5 Pro");
//		// clicking on neter botton
//		a.sendKeys(Keys.ENTER);
//		Thread.sleep(2000);
//		a.findElement(By.xpath("(//div[@class='_4rR01T'])[1]/../..//div[@class='_30jeq3 _1_WHN1']")).click();
		
		ChromeDriver cd=new ChromeDriver();
		cd.get("https://www.Flipkart.com/");
		//input[class='Pke_EE']
		WebElement a=cd.findElement(By.className("Pke_EE"));
		a.sendKeys("Realme Mobiles");
		a.sendKeys(Keys.ENTER);
		//by using independent and dependent xapth click on mobile 
		cd.findElement(By.xpath("(//div[@class='_4rR01T']) [1]/../..//div[@class='_30jeq3 _1_WHN1']")).click();

	}

}
