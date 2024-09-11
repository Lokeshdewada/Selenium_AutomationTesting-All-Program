package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkaart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeDriver d=new ChromeDriver();
		
		d.get("https://www.flipkart.com/");
		
	WebElement w = d.findElement(By.name("q"));
	d.manage().window().maximize();
	w.sendKeys("hp laptop");
	Thread.sleep(2000);
	w.sendKeys(Keys.ENTER);
	
	d.findElement(By.xpath("//div[contains(text(),'HP 14s Intel Core i3 11th Gen 1115G4 - (8 GB/512 GB SSD/Windows 11 Home) 14s - dy2508TU Thin and Light...')]")).click();
	}

}
