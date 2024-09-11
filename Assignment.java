package webdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Assignment {



	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	WebElement search = driver.findElement(By.cssSelector("input[placeholder='Search for products, brands and more']"));
	Thread.sleep(3000);
	search.sendKeys("watches");
	Thread.sleep(3000);
	search.sendKeys(Keys.ENTER);
	Thread.sleep(3000);
	
	driver.findElement(By.cssSelector("img[alt='Timex Pairs Silver-Toned Analogue Watch - TW00PR213']")).click();
	Thread.sleep(3000);
	   Set<String> ids = driver.getWindowHandles();
	   for(String x:ids) {
		  String url = driver.switchTo().window(x).getCurrentUrl();
		  
		  String childurl = "https://www.myntra.com/watch-gift-set/timex/timex-pairs-silver-toned-analogue-watch---tw00pr213/2470493/buy";
		  if(url.contains(childurl)){
			  break;
		  }
	   }
	  // driver.findElement(By.className("div[class='pincode-checkServiceAbilityhalfCard']")).click();
	   Thread.sleep(3000);
	   
	  Dimension imgone = driver.findElement(By.xpath("(//div[contains(@class,'image-grid-image')])[1]\r\n")).getSize();
	  Thread.sleep(3000);
	  System.out.println(imgone.getHeight());
	  System.out.println(imgone.getWidth());
	  
	  Dimension imgtwo = driver.findElement(By.xpath("(//div[contains(@class,'image-grid-image')])[2]\r\n")).getSize();
	  Thread.sleep(3000);
	  System.out.println("isko bolte dusre photo ki height" + imgtwo.getHeight());
	  System.out.println("isko bolte dusre photo ki width" + imgtwo.getWidth());
	  
	  Dimension imgthree = driver.findElement(By.xpath("(//div[contains(@class,'image-grid-image')])[4]\r\n")).getSize();
	  Thread.sleep(3000);
	  System.out.println("isko bolte tisre photo ki height" + imgthree.getHeight());
	  System.out.println("isko bolte tisre photo ki width" + imgthree.getWidth());
	  
	  Dimension imgfour = driver.findElement(By.xpath("(//div[contains(@class,'image-grid-image')])[3]\r\n")).getSize();
	  Thread.sleep(3000);
	  System.out.println("isko bolte chouthe photo ki height" + imgfour.getHeight());
	  System.out.println("isko bolte chouthe photo ki width" + imgfour.getWidth());
	}

}
