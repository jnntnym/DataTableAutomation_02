package stepDef;

import base.BrowserSetup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.SignUpPage;

public class ScenarioOutlineSteps extends BrowserSetup {

    SignUpPage signUpPage = new SignUpPage(driver);

    @Given("User in a Homepage")
    public void userInAHomepage() {
        System.out.println("User in a Homepage");
    }

    @When("User able to click on New Account button")
    public void userAbleToClickOnNewAccountButton() {
        signUpPage.clickCreateAcctBtn();
    }

    @Then("User should land on Sign Up page")
    public void userShouldLandOnSignUpPage() {
        System.out.println("User should land on Sign Up page");
    }

    @Then("User enter first name as {string}")
    public void userEnterFirstNameAs(String FirstName) {
        signUpPage.enterFirstName(FirstName);
    }

    @Then("User enter last name as {string}")
    public void userEnterLastNameAs(String LastName) {
        signUpPage.enterLastName(LastName);
    }

    @Then("User enter email as {string}")
    public void userEnterEmailAs(String Email) {
        signUpPage.enterEmail(Email);
    }

    @Then("User enter password as {string}")
    public void userEnterPasswordAs(String Password) {
        signUpPage.enterPassword(Password);
    }

    @Then("User enter confirm password as {string}")
    public void userEnterConfirmPasswordAs(String ConfirmPassword) {
        signUpPage.enterConfirmPassword(ConfirmPassword);
    }

    @Then("User enter month as {string}")
    public void userEnterMonthAs(String Month) {
        signUpPage.enterMonth(Month);
    }

    @Then("User enter day as {string}")
    public void userEnterDayAs(String Day) {
        signUpPage.enterBirthDay(Day);
    }

    @Then("User enter year as {string}")
    public void userEnterYearAs(String Year) {
        signUpPage.enterBirthYear(Year);
    }

    @And("User select the radio button for Gender")
    public void userSelectTheRadioButtonForGender() {
        signUpPage.genderClick();
    }

    @And("User click on checkbox for Agreement")
    public void userClickOnCheckboxForAgreement() {
        signUpPage.checkBoxAgreeClick();
    }

    @When("User click on Create New account")
    public void userClickOnCreateNewAccount() {
        signUpPage.createMyAccountBtnClick();
    }

    @Then("User should be able to Create account successfully")
    public void userShouldBeAbleToCreateAccountSuccessfully() {
        signUpPage.getThankYouMessage();
    }
}
