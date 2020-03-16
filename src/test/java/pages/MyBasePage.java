package pages;

import org.openqa.selenium.WebDriver;
import utilities.ApplicationSpecificDriver;

public  class MyBasePage extends ApplicationSpecificDriver {

    WebDriver driver;
    ApplicationSpecificDriver applicationSpecificDriver;

    public MyBasePage(){

        driver = applicationSpecificDriver.openBrowser("chrome","https://www.facebook.com/");


    }


}
