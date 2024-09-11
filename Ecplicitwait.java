package Synchronization;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ecplicitwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
   
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
       driver.get("https://www.myntra.com/");
       
       String url =driver.getCurrentUrl();
       System.out.println(url);
       if(url.equals("https://www.myntra.com/")) {
    	  System.out.println("True"); //Satisfied
       }else {
     	  System.out.println("False"); //Not Satisfied--> time out exception

       }
       System.out.println("Good Morning");
       System.out.println("Good Morning");
       System.out.println("Good Morning");
       System.out.println("Good Morning");
	}

}
