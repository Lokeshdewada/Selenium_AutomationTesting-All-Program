package assignment;
import java.io.File;
import java.io.IOException;
import java.util.Set;

import javax.print.attribute.standard.Destination;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ScreenshotAjio
{
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/?gad_source=1&gclid=Cj0KCQiAw6yuBhDrARIsACf94RVwdR6Gf5dRIM0O4gRg4JT9HjypgmUOn-qE9YKAfy1nzF3ycQFFxOkaAtzdEALw_wcB");
		WebElement a = driver.findElement(By.name("searchVal"));
		a.sendKeys("watch");
		a.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("label[class='facet-linkname facet-linkname-genderfilter facet-linkname-Men']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("img[src='https://assets.ajio.com/medias/sys_master/root/20230915/KUT5/650449c8ddf7791519db8258/lorenz_black_mk-4027r_analogue_watch_with_leather_strap.jpg']")).click();
		Set<String> id = driver.getWindowHandles();	
		System.out.println(id);
		for(String x:id)
		{
			String url = driver.switchTo().window(x).getCurrentUrl();
			String chilurl = "https://www.ajio.com/lorenz-mk-4027r-analogue-watch-with-leather-strap/p/466010056_brown";
			if(url.equals(chilurl))
			{
				break;
			}
		}
		Thread.sleep(2000);
		//driver.findElement(By.xpath("(//span[contains(text(),'ADD TO BAG')])[1]")).click();
		driver.findElement(By.xpath("(//img[contains(@alt,'Product image of LORENZ MK-4027R Analogue Watch with Leather Strap')])[8]")).click();
		Thread.sleep(2000);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File temp1 = ts.getScreenshotAs(OutputType.FILE);
		File Destination1 = new File("./Assingment/img1.png");
		FileUtils.copyFile(temp1, Destination1);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//img[contains(@alt,'Product image of LORENZ MK-4027R Analogue Watch with Leather Strap')])[7]")).click();
		Thread.sleep(2000);
		File temp2 = ts.getScreenshotAs(OutputType.FILE);
		File Destination2 = new File("./Assingment/img2.png");
		FileUtils.copyFile(temp2, Destination2);
		Thread.sleep(2000);
		File temp3 = ts.getScreenshotAs(OutputType.FILE);
		File Destination3 = new File("./Assingment/img3.png");
		FileUtils.copyFile(temp3, Destination3);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//img[contains(@alt,'Product image of LORENZ MK-4027R Analogue Watch with Leather Strap')])[10]")).click();
		Thread.sleep(2000);
		File temp4 = ts.getScreenshotAs(OutputType.FILE);
		File Destination4 = new File("./Assingment/img4.png");
		FileUtils.copyFile(temp4, Destination4);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//img[contains(@alt,'Product image of LORENZ MK-4027R Analogue Watch with Leather Strap')])[4]")).click();
		Thread.sleep(2000);
		File temp5 = ts.getScreenshotAs(OutputType.FILE);
		File Destination5 = new File("./Assingment/img5.png");
		FileUtils.copyFile(temp5, Destination5);	
		}
}