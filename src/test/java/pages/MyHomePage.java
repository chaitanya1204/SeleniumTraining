package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

public class MyHomePage extends MyBasePage {

    @FindBy(xpath = "//input[@id='email']")
    WebElement username;
    @FindBy(xpath = "//input[@id='pass']")
    WebElement password;
    @FindBy(xpath = "//input[@type='submit']")
    WebElement signin;

    public MyHomePage(){

        PageFactory.initElements(driver,this);

    }
    public void login(){
        applicationSpecificDriver.enterText(username,"");
        applicationSpecificDriver.enterText(password,"");
        applicationSpecificDriver.clickButton(signin);
    }



}
