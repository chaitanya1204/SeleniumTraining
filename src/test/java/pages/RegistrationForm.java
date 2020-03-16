package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationForm extends BasePage {

    @FindBy(xpath = "//body/div[4]//div[1]/p/a[@class='fancybox']")
    WebElement signIn;
    @FindBy(xpath = "//fieldset[1]/input[@name='username']")
    WebElement userName;
    @FindBy(xpath = "//fieldset[2]/input[@name='password']")
    WebElement passWord;
    @FindBy(xpath = "//div[4]//div[2]/input[@value='Submit']")
    WebElement submitButton;

    public RegistrationForm() {
        PageFactory.initElements(driver, this);
    }

    public void login(String username, String password) {
        applicationSpecificDriver.clickButton(signIn);
        enterUsename(username);
        enterPassword(password);
        applicationSpecificDriver.clickButton(submitButton);
    }

    public void enterUsename(String userame) {   // "keerthireddyjakkkam"
        applicationSpecificDriver.enterText(userName, userame);
    }

    public void enterPassword(String password) {     //"Keerthi@123"
        applicationSpecificDriver.enterText(passWord, password);
    }

}
