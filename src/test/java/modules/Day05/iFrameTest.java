package modules.Day05;

import org.openqa.selenium.support.How;
import static supports.CommonFunctions.*;

public class iFrameTest {
    public static void main(String[] args) {
        launchBrowser("chrome");

        String url = "https://the-internet.herokuapp.com/iframe";

        navigate(url);
        switchToFrame("mce_0_ifr");
        clearText(How.ID,"tinymce");
        fill(How.ID,"tinymce","Test iFrame");

        closeBrowser();
    }
}
