package dataDrivenFramework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DataRead {
	@FindBy(xpath = "/html/body/header/div/ul/li[1]/a")WebElement home;
	@FindBy(xpath = "/html/body/header/div/ul/li[2]/a")WebElement football;
	@FindBy(xpath = "/html/body/header/div/ul/li[3]/a")WebElement basketball;
	@FindBy(xpath = "/html/body/header/div/ul/li[4]/a")WebElement cricket;
	@FindBy(xpath = "/html/body/header/div/ul/li[5]/a")WebElement cybersports;


}
