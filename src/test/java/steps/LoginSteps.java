package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.LoginPage;
import utils.CommonMethods;
import utils.ConfigReader;

public class LoginSteps extends CommonMethods {

    @Then("admin user is successfully logged in")
    public void admin_user_is_successfully_logged_in() {
        Assert.assertTrue(dashboardPage.welcomeMessage.isDisplayed());
    }

    @When("user enters valid ESS credentials")
    public void user_enters_valid_ess_credentials() {
        sendText(login.usernameBox, "tts12345");
        sendText(login.passwordBox, "Hum@nhrm123");
    }
    @Then("ESS user is successfully logged in")
    public void ess_user_is_successfully_logged_in() {
    }

    @When("user enters invalid credentials")
    public void user_enters_invalid_credentials() {
        sendText(login.usernameBox, "tts12345");
        sendText(login.passwordBox, "Hum@nhrm3");
    }
    @Then("user sees error message on the screen")
    public void user_sees_error_message_on_the_screen() {
    }



}
