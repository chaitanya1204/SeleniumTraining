package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ApplicationSpecificDriver {
    static WebDriver driver = null;

    //public static WebDriver openBrowser(String browserName, String url) {
       public static WebDriver openBrowser(String browserName, String url){

        if (driver == null) {
            switch (browserName) {
                case "chrome":
                    System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver.exe");
                    driver = new ChromeDriver();
                    break;
                case "ie":
                    break;
                case "firefox":
                    break;
                default:
                    Assert.assertFalse(false, "Enter correct browser name");
            }
        }
           assert driver != null;
           driver.manage().window().maximize();
        driver.get(url);
        return driver;
    }

    public static void enterText(WebElement element, String text) {
        waitForElement(element);
        element.sendKeys(text);

    }

    public static void clickButton(WebElement element) {
        waitForElement(element);
        element.click();
    }

    public static void waitForElement(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}
