package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.reporters.EmailableReporter2;

import static ObjectsPath.GithubPaths.*;
import static ObjectsPath.LoginPaths.*;


public class LoginPages {
    WebDriver driver = null;

    public LoginPages(WebDriver driver) {
        this.driver = driver;


    }

    public void openGitUrl() {
        driver.get("https://github.com/");
    }

    public void clickOnSignInBtn() {
        WebElement SignInBtn = driver.findElement(signIn);
        SignInBtn.click();
    }



    public void fillEmail() {
        WebElement Email = driver.findElement(email);
        Email.sendKeys("rawan_112.stu@hotmail.com");
    }
    public void fillPassword() {
        WebElement Email = driver.findElement(password);
        Email.sendKeys("raa123321r");
    }
    public void clickOnLogin() {
        WebElement login = driver.findElement(signInBtn);
        login.click();
    }



}


