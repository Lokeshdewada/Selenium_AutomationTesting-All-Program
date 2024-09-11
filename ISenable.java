package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ISenable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ChromeDriver c=new ChromeDriver();
		c.manage().window().maximize();
		c.get("https://www.ajio.com/");
		boolean  searchtf = c.findElement(By.name("searchVal")).isEnabled();
		System.out.println(searchtf);
		
		
		// It's return type is boolean
		//To check the element is enable we can perform action
		//if element is disable we cannot perform any action
		//if element is enable this method return true
		//if enable is disable this method retuen false
		
		//Condition: The element is selection is tag name is import
	}

}
