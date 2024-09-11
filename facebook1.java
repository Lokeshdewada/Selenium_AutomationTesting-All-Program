package BasicSelect.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook1 {

	public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		   driver.get("https://www.facebook.com/signup");   
		   
		   //Step1.
		    WebElement Month= driver.findElement(By.id("month"));
		    
		    //step2.Create the object of select class
		    //Step3.In select Constructor pass targated WebElement as argument
		    Select s = new Select(Month);
		    
		    
		    //Call the non static Method
		System.out.println(s.isMultiple());  //return false  
		     
		     
	}

}


//Select class :
//	* To handle the Dropdown we are using select class
//	* There are 2 Types of dropdown are there
//	1.Single  list Dropdown
//	2.Multilist Dropdown
//	* Select is concrete class in selenium Package 
//	* with the Help of select class we can Select & deselect the element in drop down
//	* steps:
//		1.Identify the targated webElement(Dropdown)
//		2.create object of select class
//		3.Inselect Constructor pass Targerted web Element as an argument
//		4.call the non static Method of select class
//		
//		Method of Select class:
//			1.isMultiple(): 
//				*It will check the targeted dropdown is multi list dropdown or single list dropdwon.
//				*Its Return type is boolean
//				*It's return true when targeted dropedown is multi list
//				*It return false whne targeted droopdown is single list