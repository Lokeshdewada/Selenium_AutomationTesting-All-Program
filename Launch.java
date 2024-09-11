package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;//Control + shift + o
import org.openqa.selenium.remote.RemoteWebDriver;

public class Launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		//To Launch  empty chrome  browser
		ChromeDriver  d = new ChromeDriver();
		//To launch application
		d.get("https://letcode.in/test");
		//To search single element-sign up to btn
		
		d.findElement(By.linkText("Sign up")).click();
		d.manage().window().maximize();
		//to search single element-nmae tf & perform action-enter-clicking 
		d.findElement(By.id("name")).sendKeys("Lokesh Dewda");
		//to search single element email-textfileld if
		d.findElement(By.id("email")).sendKeys("lokeshdewada5@gmail.com");
		d.findElement(By.id("pass")).sendKeys("Lokesh@2001$");
		d.findElement(By.id("agree"));
		
		       // Call get (String url)  to launch appllication
//                d.get("https://www.flipkart.com/");
//            //  d.get("https://amazon.com/");
//           //  d.manage().window().maximize();
//          //d.manage().window().minimize();
//         // d.close();
//        //  d.quit();
//       // d.navigate().back();
//      // d.navigate().forward();
//       d.navigate().refresh();
		
	
   }
}
