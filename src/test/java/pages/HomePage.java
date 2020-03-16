package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage{

    @FindBy(xpath = "//img[@src='images/datepicker.jpg']")
    WebElement datePicker;

    public HomePage() {
        PageFactory.initElements(driver, this);
    }
    public void home(){

        applicationSpecificDriver.clickButton(datePicker);
    }



}
