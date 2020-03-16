package testSuite;

import org.testng.annotations.BeforeTest;
import pages.BasePage;
import pages.HomePage;
import pages.RegistrationForm;

public class MyTest {
    BasePage basePage;
    RegistrationForm registrationForm;
    HomePage homePage;

    @BeforeTest
    void beforeTest() {
        basePage = new BasePage();
        registrationForm = new RegistrationForm();
        homePage= new HomePage();
    }
}
