package stepDef;

import base.BrowserSetup;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.SignUpPage;

public class SignUpSteps extends BrowserSetup {
    SignUpPage signUpPage = new SignUpPage(driver);

    @Given("Users in a TalentTek HomePage")
    public void usersInATalentTekHomePage() {
        System.out.println("Users in a TalentTek HomePage");
    }

    @When("User clicked on Create new account button")
    public void userClickedOnCreateNewAccountButton() {
        signUpPage.clickCreateAcctBtn();
    }

    @Then("Users should be navigate to Sign Up page")
    public void usersShouldBeNavigateToSignUpPage() {
        System.out.println("User lands on a Sign up page");
    }
    // All DataTable information under one method
    @Then("Users fill out the information as below")
    public void usersFillOutTheInformationAsBelow(DataTable dataTable) {
        signUpPage.enterFirstName(dataTable.cell(1, 0));    // First name
        signUpPage.enterLastName(dataTable.cell(1, 1));     // Last name
        signUpPage.enterEmail(dataTable.cell(1, 2));        // Email
        signUpPage.enterPassword(dataTable.cell(1, 3));     // Password
        signUpPage.enterConfirmPassword(dataTable.cell(1,4));// confirm pwd
        signUpPage.enterMonth(dataTable.cell(1,5));         // Birth-Month
        signUpPage.enterBirthDay(dataTable.cell(1,6));      // Birth-Day
        signUpPage.enterBirthYear(dataTable.cell(1,7));     // Birth-Year



    }

    @And("user select male as gender")
    public void userSelectMaleAsGender() {signUpPage.genderClick();}

    @And("user click on checkbox for agreement")
    public void userClickOnCheckboxForAgreement() {
        signUpPage.checkBoxAgreeClick();
    }

    @When("user click on create new account button")
    public void userClickOnCreateNewAccountButton() {
        signUpPage.createMyAccountBtnClick();
       // System.out.println("User already fill out the form and waiting to click the button");
    }
    @Then("User should able to Create new Account successfully")
    public void userShouldAbleToCreateNewAccountSuccessfully() {
       signUpPage.getThankYouMessage();
    }

    //#################################################################
    // Second User start from below

    @Given("Second Users in a TalentTek HomePage")
    public void secondUsersInATalentTekHomePage() {
        System.out.println("Users in a TalentTek HomePage");

    }

    @When("SecondUser clicked on Create new account button")
    public void seconduserClickedOnCreateNewAccountButton() {
        signUpPage.clickCreateAcctBtn();


    }

    @Then("SecondUsers should be navigate to Sign Up page")
    public void secondusersShouldBeNavigateToSignUpPage() {
        System.out.println("User lands on a Sign up page");

    }

    @Then("SecondUsers fill out the information as below")
    public void secondusersFillOutTheInformationAsBelow(DataTable dataTable) {
        signUpPage.enterFirstName(dataTable.cell(1, 0));    // First name
        signUpPage.enterLastName(dataTable.cell(1, 1));     // Last name
        signUpPage.enterEmail(dataTable.cell(1, 2));        // Email
        signUpPage.enterPassword(dataTable.cell(1, 3));     // Password
        signUpPage.enterConfirmPassword(dataTable.cell(1,4));// confirm pwd
        signUpPage.enterMonth(dataTable.cell(1,5));         // Birth-Month
        signUpPage.enterBirthDay(dataTable.cell(1,6));      // Birth-Day
        signUpPage.enterBirthYear(dataTable.cell(1,7));     // Birth-Year


    }

    @And("Second select male as gender")
    public void secondSelectMaleAsGender() {
        signUpPage.genderClick();

    }

    @And("Second user click on checkbox for agreement")
    public void secondUserClickOnCheckboxForAgreement() {
        signUpPage.checkBoxAgreeClick();

    }

    @When("Second user click on create new account button")
    public void secondUserClickOnCreateNewAccountButton() {
        signUpPage.createMyAccountBtnClick();
    }

    @Then("Second User should able to Create new Account successfully")
    public void secondUserShouldAbleToCreateNewAccountSuccessfully() {
        signUpPage.getThankYouMessage();
    }
}
