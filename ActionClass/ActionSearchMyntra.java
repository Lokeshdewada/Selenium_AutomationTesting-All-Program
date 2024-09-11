package BasicActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionSearchMyntra {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver cd = new ChromeDriver();
		cd.manage().window().maximize();
	   cd.get("https://www.myntra.com/");
		WebElement bag	=cd.findElement(By.cssSelector("searchtf"));
	Thread.sleep(2000);
	Actions act = new Actions(cd);
	
	//Enter watches in searchtf
    //	act.sendKeys(searchtf,"watches");
	
	
	//click on bag--Sendkeys(webelement Targated, charsequenece..ch
	//act.sendKeys(bag, Keys.ENTER);
	
	//scrolling towrods down--sendkeys (Charsequenece...ch)
//	act.sendKeys(Keys.PAGE_DOWN);
//	Thread.sleep(6000);
//	act.perform();
	
	act.sendKeys(searchtf,"watches");
	Thread.sleep(2000);
	act.sendKeys(searchtf,Keys.CONTROL+"a");
	
	
	act.perform();
	}

}
