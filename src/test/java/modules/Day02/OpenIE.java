package modules.Day02;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class OpenIE {
    public static void main(String[] args) {
        InternetExplorerDriver internetExplorerDriver = new InternetExplorerDriver();
        internetExplorerDriver.manage().window().maximize();
        internetExplorerDriver.get("http://www.google.com");
    }
}
