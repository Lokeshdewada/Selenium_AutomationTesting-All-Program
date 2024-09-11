package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver c=new ChromeDriver();
		c.manage().window().maximize();
		Thread.sleep(2000);
		c.get("https://www.ajio.com/");
		Thread.sleep(4000);
		c.findElement(By.name("searchVal")).sendKeys("shoes"+Keys.ENTER);
		//c.findElement(By.cssSelector("img[src='https://assets.ajio.com/medias/sys_master/root/20231212/UwGb/65778c42ddf7791519c4dcb4/atom_white_casual_shoes_with_mesh_upper.jpg']")).click();
		Thread.sleep(4000);
		c.findElement(By.xpath("//label[contains(text(),'Men')]")).click();
       //click on the Men radio button
	}
}
