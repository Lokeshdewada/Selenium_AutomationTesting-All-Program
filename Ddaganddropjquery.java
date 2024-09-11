package BasicActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ddaganddropjquery {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver cd = new ChromeDriver();
		cd.manage().window().maximize();
     	cd.get("https://jqueryui.com/draggable/");
     	Thread.sleep(2000);
     	
     	WebElement b = cd.findElement(By.cssSelector("iframe[class='demo-frame']"));
     	cd.switchTo().frame(b);
     	
		WebElement source = cd.findElement(By.id("draggable"));
		WebElement destination = ChromeDriver.findElement(By.id("droppable"));
		
		Actions a = new Actions (cd);
		
		a.dragAndDropBy(source, 120, 0);
		a.perform();
	}

}
