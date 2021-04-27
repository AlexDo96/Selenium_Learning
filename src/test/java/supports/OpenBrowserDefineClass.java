package supports;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class OpenBrowserDefineClass {
    public void openBrowser (String browser){

        String Browser = browser.toUpperCase();

        WebDriverManager.chromedriver().setup();
        WebDriverManager.firefoxdriver().setup();
        WebDriverManager.edgedriver().setup();

        if (Browser.equals("CHROME")) {
            ChromeDriver chrome = new ChromeDriver();
            chrome.manage().window().maximize();
        }
        else if (Browser.equals("FIREFOX")){
            FirefoxDriver firefox = new FirefoxDriver();
            firefox.manage().window().maximize();
        }
        else if (Browser.equals("EDGE")){
            EdgeDriver edge = new EdgeDriver();
            edge.manage().window().maximize();
        }
        else if (Browser.equals("IE")){
            InternetExplorerDriver internetExplorerDriver = new InternetExplorerDriver();
            internetExplorerDriver.manage().window().maximize();
        }
        else if (Browser.equals("COCCOC")){
            System.setProperty("webdriver.chrome.driver","Directories Drivers/coccocdriver/chromedriver.exe");

            ChromeOptions coccoc = new ChromeOptions();
            coccoc.setBinary("C:\\Users\\Anh.DHT3772\\AppData\\Local\\CocCoc\\Browser\\Application\\browser.exe");

            WebDriver cocCOc = new ChromeDriver(coccoc);
            cocCOc.manage().window().maximize();
        }
        else if (Browser.equals("CHROME HEADLESS")){
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--headless");

            new ChromeDriver(chromeOptions);
        }
        else if (Browser.equals("FIREFOX HEADLESS")){
            FirefoxBinary firefoxBinary = new FirefoxBinary();
            firefoxBinary.addCommandLineOptions("--headless");

            FirefoxOptions firefoxOptions = new FirefoxOptions();
            firefoxOptions.setBinary(firefoxBinary);

            new FirefoxDriver(firefoxOptions);
        }
        else{
            System.out.println("\n******************************************************");
            System.out.println("Nhap sai browser roi, nhap lai ten browser di cha noi!");
            System.out.println("******************************************************");
        }
    }
}
