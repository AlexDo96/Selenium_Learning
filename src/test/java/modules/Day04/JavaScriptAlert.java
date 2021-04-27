package modules.Day04;

import static supports.CommonFunctions.*;
import org.openqa.selenium.support.How;

public class JavaScriptAlert {
    public static void main(String[] args) throws InterruptedException {
        launchBrowser("chrome");

        String url = "https://the-internet.herokuapp.com/javascript_alerts";

        navigate(url);
        clickOnLinkByText(How.XPATH, "//button", "Click for JS Alert");
        Thread.sleep(5000);
        switchToAlertPopup().accept();
        clickOnLinkByText(How.XPATH, "//button", "Click for JS Confirm");
        Thread.sleep(5000);
        switchToAlertPopup().accept();
        clickOnLinkByText(How.XPATH, "//button", "Click for JS Prompt");
        switchToAlertPopup().sendKeys("Test Alert");
        Thread.sleep(5000);
        switchToAlertPopup().accept();
        Thread.sleep(5000);
        closeBrowser();

    }
}
