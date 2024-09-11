package BasicSelect.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getoption {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	   driver.get("https://www.facebook.com/signup");   
	   
	   //Step1.Identify the target the webelemt pass
	    WebElement Month= driver.findElement(By.id("month"));
	    
	    //step2.Create the object of select class
	    //Step3.In select Constructor pass targated WebElement as argument
	    Select s = new Select(Month);
	    
	   //Step4.
	    System.out.println(s.getOptions());
	    
     }
}