package SeleniumJunitFramework.pratice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseComponents {
    
    WebDriver driver;

    public void initializeWebDriver()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    public void launchBrowser()
    {
        driver.get("");
    }




}
