package SeleniumJunitFramework.pratice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UnoptimizedTestScript {
    public static void main(String[] args){

        //ログインを自動化にする
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String username = driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p'][1]")).getText();
        String password = driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p'][2]")).getText();
        String[] splitUsername = username.split(":");
        String[] splitPassword = password.split(":");
        driver.findElement(By.cssSelector("input[name='username']")).sendKeys(splitUsername[1].trim());
        driver.findElement(By.cssSelector("input[name='password']")).sendKeys(splitPassword[1].trim());
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        driver.quit(); 
        
    
    }
    
}
