package SeleniumJunitFramework.pratice.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage {
    WebDriver driver;
    public AdminPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(css=".oxd-topbar-header-breadcrumb-module")
    WebElement headertitle;

    
    public String getHeaderTitle()
    {
       String headerTitle = headertitle.getText();
       return headerTitle;
    }

}
