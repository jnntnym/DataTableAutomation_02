package pageObject;

import base.BrowserSetup;
import io.cucumber.datatable.DataTable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import stepDef.SignUpSteps;

import java.util.List;

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

    @FindBy(how= How.XPATH, using = "//div[@class='alert alert-success']")
    public WebElement thankYouMessage;


    // Functions
    public void clickCreateAcctBtn(){
        createNewAccountBtn.click();
        System.out.println("Clicked Create New Account Btn Successfully");
    }
    public void enterFirstName(String FirstName){ // dataTable FirstName
        firstName.clear();
        firstName.sendKeys(FirstName);
        System.out.println("FirstName->"+FirstName);
    }
    public void enterLastName(String LastName){
        lastName.clear();
        lastName.sendKeys(LastName);
        System.out.println("LastName->"+LastName);
    }
    public void enterEmail(String Email){
        email.clear();
        email.sendKeys(Email);
        System.out.println("Email->"+Email);
    }
    public void enterPassword(String Password){
        passWord.clear();
        passWord.sendKeys(Password);
        System.out.println("Password->"+Password);
    }
    public void enterConfirmPassword(String ConfirmPassword){
        confirmPassword.clear();
        confirmPassword.sendKeys(ConfirmPassword);
        System.out.println("ConfirmPassword->"+ConfirmPassword);
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
    public void getThankYouMessage(){
        // String actualMessage = thankYouMessage.getText();  // Thank you for sign up, here your id - verifying with id-TTC8kKTg
        String actualMessage = thankYouMessage.getText().substring(0,21);
        System.out.println(actualMessage);
        String expectedMessage = "Thank you for sign up";
     //   Assert.assertEquals(actualMessage, expectedMessage );

        if(actualMessage.equalsIgnoreCase("Thank you for sign up")){
            System.out.println("No Error! New registration successful");
        }
        else{
            System.err.println("Validation Error!");
        }
        System.err.println("*********EndTest****************");
    }


    //***********Dynamic Select*******************************************
//    @FindBy(how= How.NAME, using = "gender")
//    public WebElement radioGender;
    //****************************

    //***************** HW: Gender Radio btn******************************
    // Find out the list of radio button and select the 2nd radio button (Female)
    //To find the all radio button > //input[@type = 'radio']
//    public void genderChoice(DataTable tableData){
//        List<WebElement> gender = radioGender.findElements(By.xpath("//input[@type = 'radio']"));
//        System.out.println("Size of gender: "+gender.size());
//        for(int i=0; i<gender.size(); i++){
//            WebElement genderChoice = gender.get(i);
//            String genderValue = genderChoice.getAttribute("value");
//            if (genderValue.equalsIgnoreCase("Female")){ // Female
//                genderChoice.click();
//                System.out.println(genderChoice.isSelected());  // boolean value return print true or false
//            }
//        }
    }
    // *******************************************************************
//}
