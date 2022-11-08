package SeleniumJunitFramework.pratice;


import org.junit.After;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import SeleniumJunitFramework.pratice.PageObjects.LandingPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseComponents {
    
    public WebDriver driver;
    public LandingPage landingPage;
    
    public WebDriver initializeWebDriver()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        return driver;
    }
    
    @BeforeAll
    public LandingPage launchBrowser()
    {
        driver = initializeWebDriver();
        landingPage = new LandingPage(driver);
        landingPage.goToPage();
        return landingPage;
    }
    @After
    public void closeDriver()
    {
        driver.close();
    }




}
