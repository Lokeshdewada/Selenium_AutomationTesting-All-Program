package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getreact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver c=new ChromeDriver();
		c.manage().window().maximize();
		c.get("https://www.facebook.com/");
	      Rectangle rect = c.findElement(By.xpath("//a[text()='Create new account']")).getRect();
	      System.out.println(rect.getWidth());
			System.out.println(rect.getHeight());
			System.out.println(rect.getX());
		    System.out.println(rect.getY());
	      
	    
	    
	    //It's return type is point
	    //Height, Width, To get X & Y axis value of the element
	}
	

}
