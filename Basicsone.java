package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basicsone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver  d = new ChromeDriver();
		d.get("https://www.pantaloons.com/");
		d.manage().window().maximize();
		//To search element- search in the webpage
		d.findElement(By.cssSelector("input[placeholder='Search for products and more...']")).sendKeys("shoes");
		//to search element-search icon in the webpage & perform the action -clicking
		d.findElement(By.cssSelector("div[class='search-bar-content-textSearch-icon']")).click();
	}

}
//css is a drawback
