package SeleniumJunitFramework.pratice;



import org.junit.Assert;
import org.junit.jupiter.api.Test;

import SeleniumJunitFramework.pratice.PageObjects.AdminPage;
import SeleniumJunitFramework.pratice.PageObjects.LandingPage;

public class LandingPageTest extends BaseComponents{
    
    //Admin画面でログインテスト
    @org.junit.Test
    public void logInTest()
    {
        
        LandingPage landingPage = launchBrowser();
        //1.LPに遷移する
        landingPage.goToPage();
        //2.画面上に記載しているアカウントでログイン    
        landingPage.inputUsername(landingPage.getUsername().trim());
        landingPage.inputPassword(landingPage.getPassword().trim()); 
        //3.[ログイン]ボタンを押下する
        AdminPage adminPage = landingPage.submitLogin();
        //4.通常にログインされているかの確認
        Assert.assertEquals("PIM", adminPage.getHeaderTitle());
        System.out.println(adminPage.getHeaderTitle());
        
        
    }
}
