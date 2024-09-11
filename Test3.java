package Synchronization;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test3 {

	private static final String ExcectedConditions = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver=new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.get("https://www.myntra.com/");
	       WebDriverWait w = new  WebDriverWait(driver,Duration.ofSeconds(2));
	       
         driver.get("https://www.myntra.com/");
         String title = driver.getCurrentUrl();
         w.until(ExpectedConditions.titleIs("Online Shopping for Women, Men, Kids Fashion & Lifestyle - Myntra"));
         System.out.println(title);
         System.out.println("GM");
	}

}
