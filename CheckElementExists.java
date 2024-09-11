package Baiscs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.NoSuchElementException;

public class CheckElementExists {
    public static void main(String[] args) {
        // Set up ChromeDriver using WebDriverManager
     //   WebDriverManager.chromedriver().setup();

        // Set up Chrome options for headless mode
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");

        // Initialize the Chrome driver
        WebDriver driver = new ChromeDriver(options);

        // URL to check
        String url = "https://www.example.com";

        // Locator for the element
        By locator = By.id("specific-element-id");  // Or By.className, By.xpath, etc.

        // Check if the element exists
        boolean elementExists = checkElementExists(driver, url, locator);

        // Print result
        if (elementExists) {
            System.out.println("Element found on the page.");
        } else {
            System.out.println("Element not found on the page.");
        }

        // Close the driver
        driver.quit();
    }

    public static boolean checkElementExists(WebDriver driver, String url, By locator) {
        try {
            driver.get(url);
            WebElement element = driver.findElement(locator);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }
}