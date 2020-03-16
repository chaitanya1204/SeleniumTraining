package stepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.*;

public class LoginSteps {
    BasePage basePage;
    RegistrationForm registrationForm;
    HomePage homePage;


    @Before
    void beforeTest() {

        registrationForm = new RegistrationForm();

    }


    @Given("I open the browser {string}")
    public void i_open_the_browser(String string) {
        //registrationForm.login();
        String browser = "firefox";
        System.out.println("I open the browser " + string);


    }

    @When("I enter username {string}")
    public void i_enter_username(String string) {
        System.out.println("I enter username");
    }

    @When("I enter password {string}")
    public void i_enter_password(String string) {
        System.out.println("I enter password");

    }

    @When("I click on submit button")
    public void i_click_on_submit_button() {
        System.out.println("I click on submit button");

    }

    @Then("I validate user homepage title")
    public void i_validate_user_homepage_title() {
        System.out.println("I validate user homepage title");

    }

}
