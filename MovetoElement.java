package BasicActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MovetoElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver cd = new ChromeDriver();
		cd.manage().window().maximize();
		cd.get("https://www.ajio.com/");
	
     	WebElement beauty = cd.findElement(By.xpath("//span[text()='BEAUTY']"));
     	Actions act = new Actions(cd);
     	
     	//act.movetoelement
//     	act.moveToElement(baeuty, +80,0);//-80 is forwarding  Beuty ---> to go Kids tag select(-)
//     	act.perform();    	

     	 act.moveByOffset(0, 10).contextClick();
     	 act.perform();
	}

}

// 1. Move to Element(WebElement Target) -- to perform mouse hovering to target element.
//2. click() --- To perform clicking operation on entire operation webpage.
//3. click(webElement Targrt)--To perform clicking operation on target ed element.
//4. ContextClick()-- To  Perform Right click operation on entire WebPage.
//5. ContextClick(webElement Targrt)-- To  Perform Right click operation on Target element.
//6.DoubleClick()--- To  Perform doubleclick operation on  entire Webpage.
//7.DoubleClick(webElement Targrt)--- to perform Doubleclick operation on Targeted Element.
///8.DoubleClick(webElement Targrt, intXoffset, intYoffset )--- to perform Mouse hovering on element on the given pixel values.
//* +Ve value --- From Targated Element move  Towards  Right
//* -Ve value --- From Targated Element move  Towards  Left
//9. MoveToElement(intXoffset, intYoffset)----to perform Mouse move  on element on  webpage on the given pixel values.
//10. Drag & drop() --- To perform Draggin  the element from source & drop in the destination.
//11.click&Hold()--- To Perform clicking & Holding on the webPage.
//12.click&Hold((webElement Targrt)-- To perform Clicking & holding on the targeted element in the Webpage.
//13.Release()-- To Perform release operation on the webpage
//14.Relase(WebElement target)-- To perform release operation on the targated element in the Webpage
//15.Perform()-- To perform action the webpage/webelement 
/// * All the Action will be stored in action array
///Return type all the
//16. Sendkeys(CharSequence...ch)-- To perform scrolling
//17. sendkeys(WebElement Target, CharSequence..ch)-- To perform entering   Data, clicking, delete, backspace.


