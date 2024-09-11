package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pentaloon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver  d = new ChromeDriver();
		d.get("https://www.pantaloons.com/");
		d.manage().window().maximize();
		Thread.sleep(2000);
	    d.findElement(By.cssSelector("input[placeholder='Search for products and more...']")).sendKeys("perfume");//eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee'
	   
	    Thread.sleep(2000);
//	    d.findElement(By.className("search-bar-content-textSearch-icon")).click();
	    WebElement a = d.findElement(By.className("search-bar-content-textSearch-icon"));
	  
	    a.click();
    

}

}