package Old.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableHandle {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-table/");
        driver.manage().window().maximize();

        String s = "Clock Tower Hotel";

        driver.findElement(By.xpath("//th[text()='" + s + "']/following-sibling::td/a")).click();


    }


}

