package modules.Day02;

import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefox {
    public static void main(String[] args) {
        FirefoxDriver firefoxDriverdriver = new FirefoxDriver();
        firefoxDriverdriver.manage().window().maximize();
        firefoxDriverdriver.get("http://www.google.com");

    }
}
