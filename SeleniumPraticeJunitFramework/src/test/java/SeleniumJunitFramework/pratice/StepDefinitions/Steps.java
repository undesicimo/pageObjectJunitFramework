package SeleniumJunitFramework.pratice.StepDefinitions;

import org.junit.Assert;

import SeleniumJunitFramework.pratice.BaseComponents;
import SeleniumJunitFramework.pratice.PageObjects.AdminPage;
import SeleniumJunitFramework.pratice.PageObjects.LandingPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class Steps extends BaseComponents{
    public LandingPage landingPage;
    public AdminPage adminPage;
    @Given("ブラウザを開く")
    public void browser_open()
    {
        landingPage = launchBrowser();
    }
    @When("ログイン画面に遷移したあと")
    public void after_going_to_login()
    {
        landingPage.goToPage();
    }
    @And("それぞれの画面上のメールとパスワードでログインする")
    public void login_with_mailpass_onscreen()
    {
        landingPage.inputUsername(landingPage.getUsername().trim());
        landingPage.inputPassword(landingPage.getPassword().trim());
    }
    @And("ログインボタンを押下")
    public void press_login_button()
    {
        adminPage = landingPage.submitLogin();
    }
    @Then("ログインが成功し、admin画面が表示されて、{string} が表示される")
    public void successful_login_check(String string)
    {
        Assert.assertEquals(string, adminPage.getHeaderTitle());
        System.out.println(adminPage.getHeaderTitle());
    }
}
