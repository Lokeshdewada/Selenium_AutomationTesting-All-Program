package assignment;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebelemntScreenshot {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		
		WebElement w=driver.findElement(By.xpath("//a[@class='myntraweb-sprite desktop-logo sprites-headerLogo ']"));
		
		File f1=w.getScreenshotAs(OutputType.FILE);
		Thread.sleep(2000);
		File destFile1=new File("./images/imgz.png");
		Thread.sleep(2000);
		FileUtils.copyFile(f1, destFile1);
		
		
	}

}

