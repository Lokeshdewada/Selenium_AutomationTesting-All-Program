package BasicjavascriptExecuter;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrooWebpage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriver driver=new ChromeDriver();
	       driver.manage().window().maximize();
	   
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	       driver.get("https://www.ajio.com/");
	       
	       Thread.sleep(2000);
	       //Step 1  Downcast javascriptExecuter--to access executescript() & 
	       JavascriptExecutor js = (JavascriptExecutor) driver;
	       
//	       //Step2 call executeScript(String  script, object)
//	       js.executeScript("window.scrollBy(0, 6000)");
//	       Thread.sleep(2000);
//	       js.executeScript("window.scrollBy(0, -3000)");
//	       Thread.sleep(2000);
	       
	       //Horizontal scrolling-from  Left to Right
	       js.executeScript("window.scrollBy(600,0)");
	       Thread.sleep(2000);
	       
	        //Horizontal scrolling-from  Right to Left
	       js.executeScript("window.scrollBy(-300, 0)");
	       Thread.sleep(2000);
	       
	       
	}

}
//2 Motive js

//scrolling purpose
//disable purpose

//2onject 
//windows--> default object 
// Document -object object represent area