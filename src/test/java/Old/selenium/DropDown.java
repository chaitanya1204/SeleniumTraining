package Old.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form/");
        driver.manage().window().maximize();
// Actions, Select

        WebElement continentsDropdown = driver.findElement(By.id("continentsmultiple"));

     /*   Select select = new Select(continentsDropdown);
        select.selectByValue("AUS");
        select.selectByValue("AN");
        select.selectByValue("EU");*/

        WebElement uploadFile = driver.findElement(By.className("input-file"));
        uploadFile.sendKeys("C:\\Selenium Training\\Selenium.txt");


        // "C:\Selenium Training\Selenium.txt"


    }
}
