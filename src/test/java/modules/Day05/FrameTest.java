package modules.Day05;

import org.openqa.selenium.support.How;
import static supports.CommonFunctions.*;

public class FrameTest {
    public static void main(String[] args) {
        launchBrowser("chrome");

        String url = "https://the-internet.herokuapp.com/nested_frames";
        //String src = "bottom";
        //String src = "left";
        //String src = "middle";
        String src = "right";

        navigate(url);

        //commonFunction.switchToFrame("frame-bottom");
        //commonFunction.switchToFrame(1);
        //commonFunction.switchToFrame(commonFunction.getElement(How.XPATH,"//frameset/frame[@src='/frame_"+src+"']"));

        switchToFrame(getWebElement(How.XPATH,"//frameset/frame[@src='/frame_top']"));
        switchToFrame(getWebElement(How.XPATH,"//frameset/frame[@src='/frame_"+src+"']"));

        System.out.println(getText(How.XPATH,"html/body"));

        closeBrowser();
    }
}
