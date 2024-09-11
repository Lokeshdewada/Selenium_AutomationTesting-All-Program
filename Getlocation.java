package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getlocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver c=new ChromeDriver();
		c.manage().window().maximize();
		c.get("https://www.facebook.com/");
	    Point  location = c.findElement(By.id("email")).getLocation();
	    System.out.println(location.getX());
	    System.out.println(location.getY());
	
		//It's return type is point 
		//To get X & Y  value of the element
	}

}