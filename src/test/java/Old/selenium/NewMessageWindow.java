package Old.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class NewMessageWindow {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[text()='Automation Practice Switch Windows']")).click();
        driver.findElement(By.xpath("//button[text()='New Message Window']")).click();
        //String S = driver.findElement(By.xpath("//button[text()='New Message Window']")).getText();
        Set<String> s = driver.getWindowHandles();
        String currentId = driver.getWindowHandle();
        System.out.println("window size:" + s.size());
        for (String k : s) {


            String actualId = driver.switchTo().window(k).getWindowHandle();
            if (!actualId.equalsIgnoreCase(currentId)) {
                break;
            }
        }

        String text = driver.findElement(By.xpath("//body")).getText();
        System.out.println(text);
    }
}
