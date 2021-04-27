package modules.Day03;

import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorTest {
    public static void main(String[] args) {
        ChromeDriver chromeDriver = new ChromeDriver();
        String url = "https://www.google.com/";

        chromeDriver.manage().window().maximize();
       /* chromeDriver.get(url);
        WebElement element = chromeDriver.findElement(By.name("q"));
        WebElement element = chromeDriver.findElement(By.xpath("//input[@name='q']"));
        WebElement element = chromeDriver.findElement(By.cssSelector("input[name='q']"));
        WebElement element = chromeDriver.findElement(By.xpath("//*[@name='q']"));
        WebElement element = chromeDriver.findElement(By.cssSelector("[name='q']"));
        element.sendKeys("Selenium");*/

    }
}
