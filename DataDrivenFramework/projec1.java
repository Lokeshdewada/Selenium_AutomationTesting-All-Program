package dataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import jxl.Sheet;
import jxl.Workbook;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class projec1 {
	
// Declaring WebDriver as public to access it.
		public WebDriver driver;
		@BeforeMethod
public void launch() throws Exception {

// Used Data Drive method to pass the Data through Excel.
FileInputStream f = new FileInputStream("C:\\Users\\lokes\\Desktop\\data.xls");
		Workbook wb = Workbook.getWorkbook(f);
		Sheet sh = wb.getSheet("Sheet1");
                             System.setProperty("webdriver.chrome.driver", sh.getCell(0,0).getContents());
		driver = new ChromeDriver();
		driver.get(sh.getCell(0, 1).getContents());

		}

	@Test
		public void Execute() throws Exception {
// Imported the Page Object method by Page Factory property.	
DataRead  E = PageFactory.initElements(driver, DataRead.class);

//scenario2. Verify the availability of each tab(Home, Cricket, Football, Basketball and Ciber Sports)

// Use of soft assertion.			
                                          SoftAssert sAssert = new SoftAssert();
                                           boolean a = E.home.isDisplayed();
                                           
			sAssert.assertEquals(a, true);
                                           System.out.println("Home tab is available");

			boolean b = E.football.isDisplayed();
			sAssert.assertEquals(b, true);
                                           System.out.println("Football tab is available");

			boolean c = E.basketball.isDisplayed();
			sAssert.assertEquals(c, true);
                                           System.out.println("Basketball tab is available");

			boolean d = E.cricket.isDisplayed();
			sAssert.assertEquals(d, true);
                                           System.out.println("Cricket tab is available");

			boolean e = E.cybersports.isDisplayed();
			sAssert.assertEquals(e, true);
                                           System.out.println("Cybersports tab is available");

            //scenario3. Verify URL of each tab contains the tab name.			   
                                                       String u = driver.getCurrentUrl();
		    boolean q = u.contains("english");
			sAssert.assertEquals(q, true);
                                           System.out.println(" URL contains the tab name");

			E.football.click();
		              String v = driver.getCurrentUrl();
			boolean r = v.contains("football");
			sAssert.assertEquals(r, true);
                                           System.out.println(" URL contains the tab name");

			E.basketball.click();
			String w = driver.getCurrentUrl();
			boolean s = w.contains("busketball");
			sAssert.assertEquals(s, true);
                                           System.out.println(" URL contains the tab name");

			E.cricket.click();
			String x = driver.getCurrentUrl();
			boolean t = x.contains("kriket");
			sAssert.assertEquals(t, true);
                                           System.out.println(" URL contains the tab name");
			
                                            E.cybersports.click();
			String y = driver.getCurrentUrl();
			boolean j = y.contains("cibersport");
			sAssert.assertEquals(j, true);
                                           System.out.println(" URL contains the tab name");

// scenario4. Store all the current URL in excel sheet
              FileOutputStream i= new FileOutputStream("C:\\Users\\lokes\\Desktop\\result.xls");
			WritableWorkbook ww = Workbook.createWorkbook(i);
			WritableSheet WS = ww.createSheet("output", 3);
			jxl. write.Label l = new jxl.write.Label(0, 0, u);
			jxl.write.Label l1 = new jxl.write.Label(0, 1, v);
			jxl.write.Label l2 = new jxl.write.Label(0, 2, w);
			jxl.write.Label l3 = new jxl.write.Label(0, 3, x);
			jxl.write.Label l4 = new jxl.write.Label(0, 4, y);
//Adding the Label value in the cell.
			WS.addCell(l);
			WS.addCell(l1);
			WS.addCell(l2);
			WS.addCell(l3);
			WS.addCell(l4);
//Saving and closing the workbook..
	ww.write();
             System.out.println("Data is written successfully on ExcelSheet");
             ww.close();

		}

//closing the application
		@AfterMethod
		public void Terminate() {
			driver.close();

		}
	}
