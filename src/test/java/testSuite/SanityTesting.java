package testSuite;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.*;

public class SanityTesting {
    BasePage basePage;
    RegistrationForm registrationForm;
    HomePage homePage;

    MyBasePage basePage1;
    MyHomePage homePage1;

    @BeforeTest
    void beforeTest() {
        basePage1 = new MyBasePage();
        registrationForm = new RegistrationForm();
        homePage1 = new MyHomePage();
    }

    @Test
    void loginTest() {
        registrationForm.login("", "");
    }

    @Test
    void logintest() {
        homePage1.login();

    }

    @Test
    void checkDatePicker() {
        registrationForm.login("", "");
        homePage.home();
    }

}
