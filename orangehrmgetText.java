package BasicSelect.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class orangehrmgetText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		   driver.get("https://www.orangehrm.com/en/book-a-free-demo/");   
		WebElement Contery =    driver.findElement(By.id("Form_getForm_Country"));
	Select s =new Select(Contery);
	
	List<WebElement> alloptions = s.getOptions();
	System.out.println(alloptions);
	
	for(WebElement a:alloptions) {
		System.out.println(a.getText());
	}
	}

}

//Getoptions(): 
//	*It will give all the option of targeted dropdown which is present inside<Select>
//*return type is List<WebElement>
//this method return Multiple options