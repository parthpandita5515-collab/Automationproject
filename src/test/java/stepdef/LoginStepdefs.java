package stepdef;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepdefs {
    @Given("^open the browser$")
    public void openTheBrowser() {
        System.out.println("open the browser");

    }

    @And("^enter the url$")
    public void enterTheUrl() {
        System.out.println("enter the url");

    }

    @And("^enter the credentials$")
    public void enterTheCredentials() {
        System.out.println("enter the credentials");

    }

    @When("^user is clicking on login button$")
    public void userIsClickingOnLoginButton() {
        System.out.println("user is clicking on login button");

    }

    @Then("^user should be able to navigate to homepage$")
    public void userShouldBeAbleToNavigateToHomepage() {
        System.out.println("user should be able to navigate to homepage");

    }

    @And("^enter the credentials \"([^\"]*)\" and \"([^\"]*)\"$")
    public void enterTheCredentialsAnd(String arg0, String arg1) throws Throwable {
        System.out.println("enter The Credentials<arg0> <arg1>");
    }

    @And("^click on signup link$")
    public void clickOnSignupLink() {
        System.out.println("click on signup link");
    }
}