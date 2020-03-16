package Old.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class SwitchWindows {


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();
        String expectedTitle = "Free QA Automation Tools Tutorial for Beginners with Examples";

        driver.findElement(By.xpath("//a[text()='Automation Practice Switch Windows']")).click();

        String homePageTitle = driver.getTitle();
        System.out.println("Before clicking: " + homePageTitle);
        driver.findElement(By.xpath("//button[text()='New Browser Window']")).click();
        String homePageTitle1 = driver.getTitle();
        System.out.println("After clicking: " + homePageTitle1);

        Set<String> s = driver.getWindowHandles();
        for (String k : s) {
            String actualTitle = driver.switchTo().window(k).getTitle();
            System.out.println("Page title is: " + actualTitle);
            if (actualTitle.equals(expectedTitle)) {
                break;
            }
        }

        System.out.println("After switching: " + driver.getTitle());
    }
}
