package Old;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {


    public static void main(String[] args) {
        System.out.println("hello");

        //"C:\Users\91868\IdeaProjects\com\src\test\resources\drivers\chromedriver.exe"

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.goindigo.in/");

        driver.manage().window().maximize();

        driver.findElement(By.xpath("//label[@for='roundTrip']")).click();

        WebElement fromCity = driver.findElement(By.xpath("//*[@id=\"bookFlightTab\"]/form/div[3]/div[1]/div[1]/div/div/input"));

        fromCity.clear();
        fromCity.sendKeys("visa" + Keys.ENTER);





    }


}
