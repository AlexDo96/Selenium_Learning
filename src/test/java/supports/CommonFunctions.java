package supports;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ByIdOrName;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class CommonFunctions {
    private static WebDriver driver;
    private static final long TIMEOUT = 60;
    private static WebDriverWait waiter;
    private static final String URL = "https://google.com";
    private static final String BROWSER = "chrome";

    public static WebDriver getDriver() {
        return driver;
    }

    public static void launchBrowser(String browser) {
        if (browser.equalsIgnoreCase("ie")) {
            driver = new InternetExplorerDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("chrome")) {
            //ChromeDriverManager.getInstance().setup();
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("edge")){
            driver = new EdgeDriver();
        } else if (browser.equalsIgnoreCase("coccoc")){
            System.setProperty("webdriver.chrome.driver","Directories Drivers/coccocdriver/chromedriver.exe");

            ChromeOptions coccoc = new ChromeOptions();
            coccoc.setBinary("C:\\Users\\Anh.DHT3772\\AppData\\Local\\CocCoc\\Browser\\Application\\browser.exe");

            WebDriver CocCoc = new ChromeDriver(coccoc);
            CocCoc.manage().window().maximize();
        }

        waiter = new WebDriverWait(driver, TIMEOUT);
    }

    public static void launchBrowser() {
        launchBrowser(BROWSER);
    }

    public static void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }

    public static By getBy(How how, String locator) {
        By element = null;
        switch (how) {
            case CLASS_NAME:
                element = By.className(locator);
                break;
            case CSS:
                element = By.cssSelector(locator);
                break;
            case ID:
                element = By.id(locator);
                break;
            case ID_OR_NAME:
                element = ByIdOrName.id(locator);
                break;
            case LINK_TEXT:
                element = By.linkText(locator);
                break;
            case NAME:
                element = By.name(locator);
                break;
            case PARTIAL_LINK_TEXT:
                element = By.partialLinkText(locator);
                break;
            case TAG_NAME:
                element = By.tagName(locator);
                break;
            case XPATH:
                element = By.xpath(locator);
                break;
            case UNSET:
                break;
        }
        return element;

    }

    public static WebElement getWebElement(How how, String locator) {
        WebElement webElement = null;

        switch (how) {
            case CLASS_NAME:
                webElement = driver.findElement(By.className(locator));
                break;
            case CSS:
                webElement = driver.findElement(By.cssSelector(locator));
                break;
            case ID:
                webElement = driver.findElement(By.id(locator));
                break;
            case ID_OR_NAME:
                break;
            case LINK_TEXT:
                webElement = driver.findElement(By.linkText(locator));
                break;
            case NAME:
                webElement = driver.findElement(By.name(locator));
                break;
            case PARTIAL_LINK_TEXT:
                webElement = driver.findElement(By.partialLinkText(locator));
                break;
            case TAG_NAME:
                webElement = driver.findElement(By.tagName(locator));
                break;
            case XPATH:
                webElement = driver.findElement(By.xpath(locator));
                break;
            case UNSET:
                break;
        }
        return webElement;
    }

    public static WebElement getElement(How how, String locator) {
        return driver.findElement(getBy(how, locator));
    }

    public static WebElement getElement(By by) {
        return driver.findElement(by);
    }

    public static List<WebElement> getWebElementList(How how, String locator) {
        return driver.findElements(getBy(how, locator));
    }

    public static void navigate(String url) {
        driver.manage().window().maximize();
        driver.get(url);
    }

    public static void navigate() {
        navigate(URL);
    }

    public static void waitForElementPresent(How how, String locator) {
        waiter.until(ExpectedConditions.visibilityOfElementLocated(getBy(how, locator)));
    }

    public static void waitForElementPresent(By by) {
        waiter.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public static void click(How how, String locator) {
        getElement(how, locator).click();
    }

    public static void click(By by) {
        waitForElementPresent(by);
        getElement(by).click();
    }

    public static void clearText(How how, String locator) {
        getElement(how, locator).clear();
    }

    public static void clearText(By by) {
        waitForElementPresent(by);
        getElement(by).clear();
    }

    public static void fill(How how, String locator, String withString) {
        waitForElementPresent(how, locator);
        getElement(how, locator).clear();
        getElement(how, locator).sendKeys(withString);
    }

    public static void fill(By by, String withText) {
        waitForElementPresent(by);
        getElement(by).clear();
        getElement(by).sendKeys(withText);
    }

    public static String getText(How how, String locator) {
        waitForElementPresent(how, locator);
        return getElement(how, locator).getText();
    }

    public static String getText(By by) {
        waitForElementPresent(by);
        return getElement(by).getText();
    }

    public static Boolean isDisplayed(How how, String locator) {
        waitForElementPresent(how, locator);
        return getElement(how, locator).isDisplayed();
    }

    public static Boolean isEnabled(How how, String locator) {
        waitForElementPresent(how, locator);
        return getElement(how, locator).isEnabled();
    }

    public static Boolean isSelected(How how, String locator) {
        waitForElementPresent(how, locator);
        return getElement(how, locator).isSelected();
    }

    public static void select(How how, String locator, String value) {
        Select selectDropdown = new Select(getElement(how, locator));
        selectDropdown.selectByVisibleText(value);
    }

    public static void check(How how, String locator) {
        if (!getElement(how, locator).isSelected()) {
            getElement(how, locator).click();
        }
    }

    public static void clickOnLinkByText(How how, String locator, String linkText) {
        getElement(how, locator + "[text()='" + linkText + "']").click();
    }

    public static void backPreviousPage() {
        driver.navigate().back();
    }

    public static void highlight(How how, String locator) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        try {
            js.executeScript("arguments[0].style.border='4px solid red'", getElement(how, locator));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void captureScreenshot() {
        File screenFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String timeStamp = System.currentTimeMillis() / 1000 + "";
        File destFile = new File("./target/screenshot/" + "Screenshot" + "-" + timeStamp + ".png");
        try {
            FileUtils.copyFile(screenFile, destFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void captureScreenshot(String filePath) throws Exception {
        File screenFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String timeStamp = System.currentTimeMillis() / 1000 + "";
        File destFile = new File("./src/main/java/reports/screenshot/" + filePath + "-" + timeStamp + ".png");
        FileUtils.copyFile(screenFile, destFile);
    }

    public static Alert switchToAlertPopup() {
        return driver.switchTo().alert();
    }

    public static void tableDetail(String cellLocator, int totalRows, int totalColumns) {
        for (int row = 1; row <= totalRows; row++) {
            for (int column = 1; column <= totalColumns; column++) {
                System.out.print(getText(How.XPATH, String.format(cellLocator, row, column)));
                System.out.print("\t");
            }
            System.out.print("\n");
        }
    }

    public static void switchToFrame(String name) {
        driver.switchTo().frame(name);
    }

    public static void switchToFrame(int index) {
        driver.switchTo().frame(index);
    }

    public static void switchToFrame(WebElement element) {
        driver.switchTo().frame(element);
    }

}
