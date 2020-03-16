package Old;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.List;

public class Signin {

    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://way2automation.com/way2auto_jquery/index.php");
        driver.manage().window().maximize();

        Thread.sleep(3000);
        driver.findElement(By.xpath("//body/div[4]//div[1]/p/a[@class='fancybox']")).click();
        driver.findElement(By.xpath("//fieldset[1]/input[@name='username']")).sendKeys("keerthireddyjakkkam");
        driver.findElement(By.xpath("//fieldset[2]/input[@name='password']")).sendKeys("Keerthi@123");
        driver.findElement(By.xpath("//div[4]//div[2]/input[@value='Submit']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//img[@src='images/datepicker.jpg']")).click();


        driver.getTitle();
        //driver.findElements(By.xpath("//iframe")).size();
        driver.switchTo().frame(0);
        System.out.println("Text is: " + driver.findElement(By.xpath("//*[@id=\"datepicker\"]")).getText());

        TakesScreenshot scrShot = ((TakesScreenshot)driver);

        File scrFile = scrShot.getScreenshotAs(OutputType.FILE);

        File dstFile = new File("C:\\Selenium Training\\Screenshots\\FirstSS.png");

        FileUtils.copyFile(scrFile,dstFile);



        driver.findElement(By.xpath("//*[@id=\"datepicker\"]")).click();
        //driver.findElement((By.xpath("//a[text()='20']"))).click();
        List<WebElement> dates = driver.findElements((By.xpath("//tbody/tr/td/a")));

        String expDate = ReadProperty.getValue("date");

        for (int i = 0; i < dates.size(); i++) {
            String actualDate = dates.get(i).getText();
            if (expDate.equals(actualDate)) {
                dates.get(i).click();
                break;
            }
        }


    }
}
