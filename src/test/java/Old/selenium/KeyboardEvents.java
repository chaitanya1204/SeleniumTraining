package Old.selenium;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.File;

public class KeyboardEvents {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //driver.get("https://demoqa.com/");
        driver.navigate().to("https://demoqa.com/keyboard-events-sample-form/");
        driver.manage().window().maximize();
        System.out.println("Size: " + driver.findElements(By.xpath("//span")).size());


        /*TakesScreenshot scrShot = ((TakesScreenshot) driver);
        //File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
        File ScrFile = scrShot.getScreenshotAs(OutputType.FILE);

        File DestFile = new File("C:\\Selenium Training\\Screenshots\\FirstSS.png");

        FileUtils.copyFile(ScrFile, DestFile);
        WebElement cleck = driver.findElement(By.xpath("//a[@href='https://demoqa.com/keyboard-events-sample-form/']"));*/

        /*JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", cleck);*/
        JavascriptExecutor sj = (JavascriptExecutor)driver;
        sj.executeScript("arguments[0].value='keerthi';",driver.findElements(By.xpath("//input[@id='userName']")));


//        Actions actions = new Actions(driver);
//        actions.clickAndHold(driver.findElement(By.xpath("//span"))).moveByOffset(300, 0).build().perform();

        //  actions.dragAndDropBy(driver.findElement(By.xpath("//span")), 0, 60).build().perform();

        //     actions.dragAndDropBy(driver.findElement(By.xpath("//span")), 200, 0).build().perform();

    /*    driver.findElement(By.xpath("//a[@href='https://demoqa.com/keyboard-events-sample-form/']")).click();
        driver.findElement(By.id("userName")).sendKeys("Keerthireddy");
        driver.findElement(By.id("currentAddress")).sendKeys("Hyderabad");
        driver.findElement(By.id("permanentAddress")).sendKeys("Ongole");

        driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();*/
   /*     Thread.sleep(5000);

        driver.switchTo().alert().accept();*/

        //   driver.findElement(By.xpath("")).is


        //driver.navigate().back();

        //  driver.findElement(By.li)

    }
}
