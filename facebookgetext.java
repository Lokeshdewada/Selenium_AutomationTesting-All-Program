package BasicSelect.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebookgetext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		   driver.get("https://www.facebook.com/signup");   
		   
		   //Step1.
		    WebElement Month= driver.findElement(By.id("month"));
		    
		    //step2.Create the object of select class
		    //Step3.In select Constructor pass targated WebElement as argument
		    Select s = new Select(Month);
		    
		    //step4.call Non Static method select class
		 List<WebElement> alloptions = s.getOptions();
		 
		 //To get ids of all months
		System.out.println(alloptions);
		
		for(WebElement a:alloptions) {
			System.out.println(a.getText());
		}
	}

}
