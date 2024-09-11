package BasicSelect.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectMultilistdropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/test");
		
		//click on Drop-Down
		driver.findElement(By.xpath("//a[text()='Drop-Down')")).click();
		
		WebElement dropdown = driver.findElement(By.id("superheros"));
		
		Select s = new Select(dropdown);
		s.selectByVisibleText("Black Panther");
		s.selectByVisibleText("Batman");
		
		WebElement  option = s.getFirstSelectedOption();
		
		
	}

}
