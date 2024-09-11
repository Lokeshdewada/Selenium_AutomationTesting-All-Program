package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mynta1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver c=new ChromeDriver();
		c.manage().window().maximize();
		Thread.sleep(2000);
		c.get("https://www.myntra.com/");
		Thread.sleep(4000);
		c.findElement(((WebElement) By.xpath("//img[contain(@src,'https://assets.myntassets.com/dpr_2,q_60,w_210,c_limit,fl_progressive/assets/images/251023/2022/8/2/dc546878-8926-4201-94ee-60a54630469a1659437976605-CASIO-Men-Vintage-Silver-Dial-Men-Vintage-Watch-A-158WA-1Q---1.jpg')]")).click();
		
	}

}


//<img draggable="false" src="https://assets.myntassets.com/dpr_2,q_60,w_210,c_limit,fl_progressive/assets/images/251023/2022/8/2/dc546878-8926-4201-94ee-60a54630469a1659437976605-CASIO-Men-Vintage-Silver-Dial-Men-Vintage-Watch-A-158WA-1Q---1.jpg" class="img-responsive" alt="CASIO VINTAGE Men Watch D011 A-158WA-1Q" title="CASIO VINTAGE Men Watch D011 A-158WA-1Q" style="width: 100%; display: block;">
////img[contain(@src,'https://assets.myntassets.com/dpr_2,q_60,w_210,c_limit,fl_progressive/assets/images/251023/2022/8/2/dc546878-8926-4201-94ee-60a54630469a1659437976605-CASIO-Men-Vintage-Silver-Dial-Men-Vintage-Watch-A-158WA-1Q---1.jpg')]