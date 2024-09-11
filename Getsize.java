package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getsize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				ChromeDriver c=new ChromeDriver();
				c.manage().window().maximize();
				c.get("https://www.facebook.com/");
				Dimension size = c.findElement(By.id("email")).getSize();
				System.out.println(size.getWidth());
				System.out.println(size.getHeight());

	}

}
