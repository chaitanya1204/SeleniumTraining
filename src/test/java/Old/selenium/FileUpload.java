package Old.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Krishna");
        driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("Chaitanya");
        String s = "Male";
        //input[@value='Male']
        driver.findElement(By.xpath("//input[@value='" + s + "']")).click();
        String i="4";
        driver.findElement(By.xpath("//input[@value='"+ i +"']")).click();
        driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("12-04-1992");
        driver.findElement(By.xpath("//input[@value='Automation Tester']")).click();



    }
}
