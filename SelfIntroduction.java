package Baiscs;

import org.openqa.selenium.chrome.ChromeDriver;

public class SelfIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ChromeDriver driver = new ChromeDriver();
    driver.get("https://www.youtube.com/");  
    System.out.println(driver.getTitle());
     System.out.println(driver.getCurrentUrl());
      driver.close();
     driver.quit();
     }

}
