package Old.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[text()='Selectable']")).click();

        WebElement s1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
        WebElement s2 = driver.findElement(By.xpath("//li[text()='Item 2']"));
        WebElement s3 = driver.findElement(By.xpath("//li[text()='Item 5']"));
        WebElement s4 = driver.findElement(By.xpath("//li[text()='Item 7']"));


        Actions actions = new Actions(driver);

        actions.keyDown(Keys.CONTROL).click(s1).click(s2).click(s3).click(s4).keyUp(Keys.CONTROL);
        actions.build().perform();
        //actions.dragAndDrop(source, target).build().perform();

        // actions.dragAndDropBy(target, 0, 257).build().perform();
        //  actions.click(s1).click(s2).click(s3).click(s4).build().perform();
        //actions.clickAndHold(s2).clickAndHold(s2).clickAndHold(s3).clickAndHold(s4).build().perform();
        //   actions.clickAndHold(s1).clickAndHold(s3).build().perform();
    }


}
