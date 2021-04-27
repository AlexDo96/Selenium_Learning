package modules.Day03;

import supports.OpenBrowserDefineClass;

public class TestLocatorPage {
    public static void main(String[] args) {
        OpenBrowserDefineClass browser = new OpenBrowserDefineClass();
        browser.openBrowser("chrome");

        String urllogin = "https://the-internet.herokuapp.com/login";
        String urldropdown = "https://the-internet.herokuapp.com/dropdown";
        String urlcheckboxes = "https://the-internet.herokuapp.com/checkboxes";
        String urlredirector = "https://the-internet.herokuapp.com/redirector";

        /*
        WebElement usernameInput = chromeDriver.findElement(By.xpath("//input[@name='username']"));
        WebElement passwordInput = chromeDriver.findElement(By.xpath("//input[@name='password']"));
        WebElement loginBtn = chromeDriver.findElement(By.xpath("//button[@type='submit']"));
        WebElement username = chromeDriver.findElement(By.xpath("//label[.='Username']/../input"));  //sibling
        WebElement password = chromeDriver.findElement(By.xpath("//label[.='Password']/../input"));  //sibling
        WebElement login = chromeDriver.findElement(By.xpath("//label[.='Username']"));

        //--------------------------------------------
        navigate(urllogin);
        usernameInput.sendKeys("tomsmith");
        passwordInput.sendKeys("SuperSecretPassword!");
        loginBtn.click();
        closeBrowser();
        //--------------------------------------------
        navigate(urllogin);
        username.sendKeys("tomsmith");
        password.sendKeys("SuperSecretPassword!");
        login.click();
        closeBrowser();
        //--------------------------------------------
        navigate(urllogin);
        getWebElement(How.XPATH, "//input[@name='username']").sendKeys("tomsmith");
        getWebElement(How.XPATH, "//input[@name='password']").sendKeys("SuperSecretPassword!");
        getWebElement(How.XPATH, "//button[@type='submit']").click();
        closeBrowser();
        //--------------------------------------------
        navigate(urllogin);
        getElement(How.XPATH, "//input[@name='username']").sendKeys("tomsmith");
        getElement(How.XPATH, "//input[@name='password']").sendKeys("SuperSecretPassword!");
        getElement(How.XPATH, "//button[@type='submit']").click();
        closeBrowser();
        //---------------------------------------------
        navigate(urllogin);
        fill(How.XPATH, "//input[@name='username']","tomsmith");
        fill(How.XPATH, "//input[@name='password']","SuperSecretPassword!");
        click(How.XPATH, "//button[@type='submit']");
        closeBrowser();

        //-----------------------------------------Homework--------------------------------------------------------
        //----------------Dropdown---------------------
        navigate(urldropdown);
        select(How.XPATH, "//*[@id='dropdown']","Option 1");
        closeBrowser();

        //----------------Checkboxes---------------------
        navigate(urlcheckboxes);
        check(How.XPATH,"//*[@id='checkboxes']/text()[1]");
        check(How.XPATH,"//*[@id='checkboxes']/text()[2]");
        closeBrowser();
        //----------------Redirect---------------------
        navigate(urlredirector);
        clickOnLinkByText(How.XPATH, "//*[@id='redirect']","here");
        clickOnLinkByText(How.XPATH,"//a","200");
        backPreviousPage();
        clickOnLinkByText(How.XPATH,"//a","301");
        backPreviousPage();
        clickOnLinkByText(How.XPATH,"//a","404");
        backPreviousPage();
        wait(How.XPATH, "//*[@href='status_codes/500']");
        clickOnLinkByText(How.XPATH,"//a","500");
        backPreviousPage();
        closeBrowser();*/

    }
}
