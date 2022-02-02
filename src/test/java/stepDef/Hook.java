package stepDef;

import base.BrowserSetup;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.util.Strings;

public class Hook extends BrowserSetup {

    public static String envData = System.getProperty("env");   // env catch from terminal
    public static String driverType = System.getProperty("browser"); // browser catch from terminal
    public static String url;
    public static String email;
    public static String password;

    @Before
    public void startTest(){
        // happen before each test scenario
        // setup default browser

        if (Strings.isNullOrEmpty(driverType)){
            driverType="ch";
        }

        // default environment setup
        if(Strings.isNullOrEmpty(envData)){
            envData = "qa";
        }

        // Choose the envData, which we want to
       driver = setupBrowser(driverType);
        switch (envData){
            case "qa":
                url = "http://qa.taltektc.com";
                email = "nayeemsisir20@gmail.com";
                password = "n@123456#";
                break;
            case "stg":
                url = "http://stage.taltektc.com";
                email = "stgtest@hotmail.com";
                password = "Test543";
                break;
            case "prd": //  ????
                url = "http://prod.taltektc.com";
                break;
        }
        driver.get(url);
    }
    // happen after each test
    // what happen if test fails? what you will do for the  failing test case? screenshot? logs? ??
    @After
    public void endTest(Scenario scenario) {
        try {
            if (scenario.isFailed()){
                final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                // embed it in the report.
                scenario.attach(screenshot, "image/png", scenario.getName());
            }
        } finally {
            //driver.quit();
        }
    }
}
