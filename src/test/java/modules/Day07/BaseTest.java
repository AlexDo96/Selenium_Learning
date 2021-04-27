package modules.Day07;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.qameta.allure.Attachment;
import org.testng.ITestResult;
import org.testng.annotations.*;

import static supports.CommonFunctions.*;

public class BaseTest {
    @Parameters("browser")
    @BeforeTest
    public void setUp(String browser) {
        launchBrowser(browser);
    }

    @Parameters("url")
    @BeforeMethod
    public void init(String url) {
        navigate(url);
    }

    @AfterMethod
    public void clear(ITestResult result) throws Exception {
        if (result.isSuccess()) {
            System.out.println("TEST PASSED");
        } else {
            System.out.println("TEST FAILED");
            captureScreenshot(result.getInstance().toString());
            saveScreenshot(((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.BYTES));
        }
    }

   @Attachment(value = "Page screenshot", type = "image/png")
    public byte[] saveScreenshot(byte[] screenShot) {
        return screenShot;
    }

    @AfterTest
    public void tearDown() {
        closeBrowser();
    }

}
