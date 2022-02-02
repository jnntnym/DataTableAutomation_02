package pageObject;

import base.BrowserSetup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SignUpPage extends BrowserSetup {

    // Constructor
   public SignUpPage(WebDriver driver){
       PageFactory.initElements(driver, this);
       BrowserSetup.driver = driver;
   }
   // locators
    @FindBy(how = How.CLASS_NAME, using = "new-account")
    public WebElement createNewAccountBtn;

    @FindBy(how= How.NAME, using = "firstName")
    public WebElement firstName;

    @FindBy (how= How.NAME, using = "lastName")
    public WebElement lastName;

    @FindBy(how= How.NAME, using = "email")
    public WebElement email;

    @FindBy(how = How.NAME, using = "password")
    public WebElement passWord;

    @FindBy(how = How.NAME, using = "confirmPassword")
    public WebElement confirmPassword;

    @FindBy (how= How.NAME, using = "month")
    public WebElement month;

    @FindBy (how= How.NAME, using = "day")
    public WebElement day;

    @FindBy (how= How.NAME, using = "year")
    public WebElement year;

    @FindBy(how= How.ID, using = "male")
    public WebElement radioMale;

    @FindBy(how = How.NAME, using = "agree")
    public WebElement agree;

    @FindBy(how = How.XPATH, using = "//button[@type='submit']")
    public WebElement createMyAccountBtn;

    // Functions
    public void clickCreateAcctBtn(){
        createNewAccountBtn.click();
        System.out.println("Clicked Create New Account Btn Successfully");
    }
    public void enterFirstName(String FirstName){ // dataTable FirstName
        firstName.clear();
        firstName.sendKeys(FirstName);
    }
    public void enterLastName(String LastName){
        lastName.clear();
        lastName.sendKeys(LastName);
    }
    public void enterEmail(String Email){
        email.clear();
        email.sendKeys(Email);
    }
    public void enterPassword(String Password){
        passWord.clear();
        passWord.sendKeys(Password);
    }
    public void enterConfirmPassword(String ConfirmPassword){
        confirmPassword.clear();
        confirmPassword.sendKeys(ConfirmPassword);
    }
    public void enterMonth(String Month){   // data table Month
        Select ddlMonth = new Select(month);
        ddlMonth.selectByVisibleText(Month);
        System.out.println("Month select as->"+Month);
    }
    public void enterBirthDay(String Day){
        Select ddlDay = new Select(day);
        ddlDay.selectByVisibleText(Day);
        System.out.println("Day select as->"+Day);
    }
    public void enterBirthYear(String Year){
        Select ddlYear = new Select(year);
        ddlYear.selectByValue(Year);
        System.out.println("Year select as->"+Year);
    }
    public void genderClick(){
        radioMale.click();
    }
    public void checkBoxAgreeClick(){
        agree.click();
    }
    public void createMyAccountBtnClick(){
        createMyAccountBtn.click();
    }
}
