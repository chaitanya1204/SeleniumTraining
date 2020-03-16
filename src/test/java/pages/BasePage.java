package pages;

import org.openqa.selenium.WebDriver;
import utilities.ApplicationSpecificDriver;

public class BasePage extends ApplicationSpecificDriver{
    WebDriver driver;
    ApplicationSpecificDriver applicationSpecificDriver;

    public BasePage() {
        driver = applicationSpecificDriver.openBrowser("chrome", "http://way2automation.com/way2auto_jquery/index.php");
    }


}
