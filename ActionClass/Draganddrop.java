package BasicActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver cd = new ChromeDriver();
		cd.manage().window().maximize();
     	cd.get("https://letcode.in/dropable");
		WebElement source = cd.findElement(By.id("draggable"));
		
		WebElement destination = cd.findElement(By.id("draggable"));
		
		Actions a = new  Actions(cd);
		//a.dragAndDrop(source, destination);
		//WE can perform Drag and Drop operation with the Help of click&Hold(WT), MoveToElementt(WT), 
		a.clickAndHold(source).moveToElement(destination).release();
		//a.perform();
		
		}
}