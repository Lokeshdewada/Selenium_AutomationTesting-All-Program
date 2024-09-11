package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Letcode {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
//		driver.get("https://letcode.in/test");
//		driver.manage().window().maximize();
//		Thread.sleep(3000);
//		driver.findElement(By.className("card-footer-item").click();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
       	Thread.sleep(3000);
		//boolean  emailtf = driver.findElement(By.id("email")).isDisplayed();
		//boolean  emailtf = driver.findElement(By.id("pass")).isDisplayed();
		
		System.out.println(emailtf);
	}

}
//Assignment

// Launch - https://skillrary.com
//click on gears
//click on skillrary demo app--open new tab
//Inspect the text field and check it is enable or disable
