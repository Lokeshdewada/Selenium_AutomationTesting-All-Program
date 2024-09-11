package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pantaloon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.pantaloons.com/");
	driver.findElement(By.xpath("//input[@placeholder='Search for products and more...']")).sendKeys("shoes"+Keys.ENTER);
	driver.findElement(By.className("Search for products and more...\""));
	driver.findElement(By.cssSelector("img[alt='Brown Solid Casual Shoes']")).click();
	
	

}
}