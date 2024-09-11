package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntraget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver c=new ChromeDriver();
		c.manage().window().maximize();
		c.get("https://www.myntra.com/");
		Dimension size = c.findElement(By.id("desktop-searchBar")).getSize();
		System.out.println(size.getWidth());
		System.out.println(size.getHeight());
//		  Point  location = c.findElement(By.id("desktop-searchBar")).getLocation();
//		    System.out.println(location.getX());
//		    System.out.println(location.getY());
//		    Rectangle rect = c.findElement(By.xpath("//a[text()='Create new account']")).getRect();
//		      System.out.println(rect.getWidth());
//				System.out.println(rect.getHeight());
//				System.out.println(rect.getX());
//			    System.out.println(rect.getY());
		    driver.findeElement(By.className("desktop-searchBar")).semdkey("Watches");
		    driver.findeElement(By.className("desktop-submit")).click();
		    Thread.sleep(2000);
		    //To take the height and width of the watch image
		    Dimension watch = ChromeDriver.findElements\(By.cssSelector(""));
		    System.out.println(watch.getWidth());
		    System.out.println(watch.getHeight());
		    
		    
		    // Assignement is particular image is check a scrrenshot is height and weidth check
		      

	}

}
