package modules.Day07;

import static supports.CommonFunctions.*;

public class DebugTest {

    public static void main(String[] args) {
        launchBrowser("chrome");
        navigate("http://the-internet.herokuapp.com/nested_frames");
        switchToAlertPopup();
    }
}
