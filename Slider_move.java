package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider_move {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver td = new ChromeDriver();
		td.manage().window().maximize();
		td.get("https://jqueryui.com/");

		// for scrolling down
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) td;
		js.executeScript("window.scrollBy(0,500)");

		// to click on Slider
		Thread.sleep(2000);
		td.findElement(By.xpath("//a[text()='Slider']")).click();

		// Action taking to move one place to another
		Thread.sleep(2000);
		WebElement frame = td.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		td.switchTo().frame(frame);

		// holding the buttom
		Thread.sleep(2000);
		WebElement slider = td.findElement(By.xpath("//*[@id=\"slider\"]/span"));

		Thread.sleep(2000);
		Actions action = new Actions(td);
		action.dragAndDropBy(slider, 100, 125).perform();

	}

}