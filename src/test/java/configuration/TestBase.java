package configuration;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import static supports.CommonFunctions.*;

public class TestBase {
    @Parameters({"browser"})

    @BeforeMethod
    public static void setup(String browser){launchBrowser(browser);}

    @AfterMethod
    public static void tearDown(ITestResult result){
        if(!result.isSuccess()){
            captureScreenshot();
        }
        closeBrowser();
    }

}
