package modules.Day02;

import supports.OpenBrowserDefineClass;

public class OpenBrowser {
    public static void main(String[] args) {
        String url = "https://www.google.com/";

        OpenBrowserDefineClass browserObject = new OpenBrowserDefineClass();
        browserObject.openBrowser("chrome");
        browserObject.openBrowser("firefox");
        browserObject.openBrowser("edge");
        browserObject.openBrowser("ie");
        browserObject.openBrowser("coccoc");
        browserObject.openBrowser("chrome headless");
        browserObject.openBrowser("firefox headless");
        browserObject.openBrowser("dayla1caibrowser");
    }
}
