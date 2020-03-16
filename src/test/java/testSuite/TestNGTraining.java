package testSuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGTraining {

    @Test
    void test1() {

        String expected = "Use our Flight Finder\n" +
                "       to search for the lowest fare on participating airlines. Once you've booked \n" +
                "      your flight, don't forget to visit the Mercury Tours Hotel Finder to reserve \n" +
                "      lodging in your destination city.";


        String expected2 = "Use our Flight Finder\n" +
                "       to search for the lowest fare on participating airlines. Once you've booked \n" +
                "      your flight, don't forget to visit the Mercury Tours Hotel Finder to reserve \n" +
                "      lodging in your destination city.";

        System.out.println("In test1");
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://newtours.demoaut.com/");

        driver.findElement(By.name("userName")).sendKeys("ajay0589");
        driver.findElement(By.name("password")).sendKeys("ajay1234");
        driver.findElement(By.name("login")).click();

        String actual = driver.findElement(By.xpath("//font[contains(text(),'Flight Finder')]")).getText();

        Assert.assertTrue(actual.contains("Flight Finderxcv"));

    }

    @Test()
    void test2() {
        System.out.println("In test2");
    }

    @Test(dataProvider = "testData")
    void test3(String userName, String password) {
        System.out.println("In test3 " + userName + " " + password);
    }

    @DataProvider
    Object[][] testData() {
        Object[][] a = new Object[2][2];
        a[0][0] = "ajay0589";
        a[0][1] = "ajay1234";
        return a;
    }

    @DataProvider
    Object[][] testData1() {
        Object[][] a = new Object[2][2];
        a[0][0] = "ajay0589";
        a[0][1] = "ajay1234";
        return a;
    }


}
