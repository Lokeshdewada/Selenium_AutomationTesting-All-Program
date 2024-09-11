package assignment;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverAjio {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver cd = new ChromeDriver();
		cd.manage().window().maximize();
		cd.get("https://www.ajio.com/");
		WebElement men = cd.findElement(By.xpath("//span[text()='MEN']"));
		Actions a = new Actions(cd);
		a.moveToElement(men);
		a.perform();
		cd.findElement(By.xpath("(//a[text()='Sunglasses & Frames'])[1]")).click();
		cd.findElement(By.xpath("//div[text()='Men UV-Protected Round Sunglasses-3040MG3982']")).click();
		Set<String> tabs = cd.getWindowHandles();
		for(String ab:tabs) {
			String title = cd.switchTo().window(ab).getTitle();
			if(tabs.contains(title)) {
				break;
			}
		}
		cd.findElement(By.xpath("//span[text()='ADD TO BAG']")).click();
		Thread.sleep(2000);
		cd.findElement(By.xpath("//span[text()='GO TO BAG']")).click();
		
		TakesScreenshot ts = (TakesScreenshot) cd;
		File tempFile = ts.getScreenshotAs(OutputType.FILE);
		File destinationFile = new File("./Ajio/bag.png");
		FileUtils.copyFile(tempFile, destinationFile);
		
    }
}