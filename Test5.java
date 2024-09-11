package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver=new ChromeDriver();
	       driver.manage().window().maximize();
	     //  WebDriverWait w = new  WebDriverWait(driver,Duration.ofSeconds(2));
	       driver.get("https://www.myntra.com/");
	       driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
	       driver.findElement(By.className("desktop-searchBar")).sendKeys("wallet"+Keys.ENTER);
	}

}
