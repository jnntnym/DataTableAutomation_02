package pageObject;

import base.BrowserSetup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BrowserSetup {

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        BrowserSetup.driver = driver;
    }

    // locators
    @FindBy(how= How.NAME, using = "email")
    public WebElement emailLocator;     // variable declared here

    @FindBy(how= How.NAME, using = "password")
    public WebElement passwordLocator;

    @FindBy(how= How.CLASS_NAME, using = "my-login")  // my-login
    public WebElement loginButton;

    @FindBy(how= How.CLASS_NAME, using = "new-account")
    public WebElement createNewAccountBtn;

    // Function
    public void enterEmailAddress(String email){
        emailLocator.sendKeys(email);       //
    }  // parameterized method to pass the parameter
    public void enterPassword(String pass){
        passwordLocator.sendKeys(pass);}
    public void loginButtonClick(){
        loginButton.click();  // variable used
    }
    public void clickCreateNewAccountBtn(){
        createNewAccountBtn.click();
    }

}

