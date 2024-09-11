package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;
import org.openqa.selenium.support.ui.Select;

public class SelectClassAmazon {

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			WebDriver cd=new ChromeDriver();
			cd.manage().window().maximize();
			cd.get("https://www.amazon.com/");
			Thread.sleep(8000);
			cd.findElement(By.id("icp-nav-flyout")).click();
			Thread.sleep(1000);
			WebElement currency = cd.findElement(By.id("icp-currency-dropdown"));
			Select sc = new Select(currency);
			Thread.sleep(1000);
			sc.selectByValue("INR");
		

	}

}
