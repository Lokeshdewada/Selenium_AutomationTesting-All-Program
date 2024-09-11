package BasicActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Clickandhold {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver cd = new ChromeDriver();
		cd.manage().window().maximize();
		cd.get("https://ajio.com/");
	//WebElement cart	=cd.findElement(By.className("ic-cart"));
		WebElement cart	=cd.findElement(By.cssSelector("div[class='ic-cart'])"));
	Actions act = new Actions(cd);
	act.clickAndHold(cart);
	Thread.sleep(2000);
	//act.release();
	act.release(cart);
	act.perform();
	
	}

}
