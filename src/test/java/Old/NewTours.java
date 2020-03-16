package Old;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

public class NewTours {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://way2automation.com/way2auto_jquery/index.php");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Keerthi");
        driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("9494123123");
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Keerthi@gmail.com");
        driver.findElement(By.xpath("//select[@name='country']")).sendKeys("india");
        driver.findElement(By.xpath("//input[@name='city']")).sendKeys("hyderabad");
        driver.findElement(By.xpath("//fieldset[6]/input[@name='username']")).sendKeys("keerthireddyjakkkam");
        driver.findElement(By.xpath("//*[@id=\"load_form\"]/fieldset[7]/input")).sendKeys("Keerthi@123");
        driver.findElement(By.xpath("//body/div//div/input[@value='Submit']")).click();
 /*       driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("ajay0589");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("ajay1234");
        driver.findElement(By.xpath("//input[@name='login']")).click();*/


    }


}
