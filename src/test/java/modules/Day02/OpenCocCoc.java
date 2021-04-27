package modules.Day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OpenCocCoc {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Directories Drivers/coccocdriver/chromedriver.exe");

        ChromeOptions coccoc = new ChromeOptions();
        coccoc.setBinary("C:\\Users\\Anh.DHT3772\\AppData\\Local\\CocCoc\\Browser\\Application\\browser.exe");

        WebDriver cocCOc = new ChromeDriver(coccoc);
        cocCOc.manage().window().maximize();
        cocCOc.get("https://www.google.com/");
    }
}
