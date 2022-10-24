package SeleniumJunitFramework.pratice.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
    public WebDriver driver;
    public LandingPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath ="//p[@class='oxd-text oxd-text--p'][1]")
    WebElement usernameField;
    @FindBy(xpath ="//p[@class='oxd-text oxd-text--p'][2]")
    WebElement passwordField;
    @FindBy(css="input[name='username']")
    WebElement usernameInput;
    @FindBy(css="input[name='password']")
    WebElement passwordInput;
    @FindBy(css ="button[type='submit']")
    WebElement submitButton;

    public void goToPage()
    {
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }
    
    public String getUsername()
    {
        String username = usernameField.getText();
        String[] splitUsername = username.split(":");
        return splitUsername[1];
    }
    public String getPassword()
    {
        String password =passwordField.getText();
        String[] splitPassword = password.split(":");
        return splitPassword[1];
    }
    public void inputUsername(String username)
    {
        usernameInput.sendKeys(username);
    }
    public void inputPassword(String password)
    {
        passwordInput.sendKeys(password);
    }
    public AdminPage submitLogin()
    {
        submitButton.click();
        AdminPage adminPage = new AdminPage(driver);
        return adminPage;
    }
}
