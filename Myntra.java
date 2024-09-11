package Basics;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver d=new ChromeDriver();
		
		d.get("https://www.myntra.com/");
		
		WebElement v = d.findElement(By.xpath("//input[@class=\"desktop-searchBar\"]"));
		
		
		
		v.sendKeys("wthach");
		v.sendKeys(Keys.ENTER);
		d.findElement(By.xpath("//label[text()='Men']")).click();
		
		d.findElement(By.xpath("//lable[text()='Watch Gift Set']")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		
//		d.findElement(By.xpath("//span[text()='Recommended']")).click();
	}

}
