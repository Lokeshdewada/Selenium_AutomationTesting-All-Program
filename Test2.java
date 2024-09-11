package Synchronization;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   WebDriver driver=new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.get("https://www.myntra.com/");
	       
	       //Step1 create object of webdriverwait  class &
	       //in webDriverwait constructor pass argumenet -webdriver reference
	       WebDriverWait w = new  WebDriverWait(driver,Duration.ofSeconds(2));
	       
	       driver.get("https://www.myntra.com/");
	       
	       String url = driver.getCurrentUrl();
	       //Step2 call until()--> Method pass argumenet function 
	       //step3 pass the predicate function (consition Method)as  argument inside until method
	       
	       
	   w.until(ExpectedConditions.urlToBe("https://www.myntra.com/"));
	       //Urltobe  a Method 
	       System.out.println(url);
	      System.out.println("Good Morning");
	      
	}

}
