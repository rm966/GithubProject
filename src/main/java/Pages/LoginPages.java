package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static ObjectsPath.GithubPaths.*;


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

    public void clickOnSignUpBtn() {
        WebElement SignUpBtn = driver.findElement(signUp);
        SignUpBtn.click();
    }


    public void clickOnTermsBtn(){
        WebElement TermsBtn = driver.findElement(termsOfService);
        TermsBtn.click();
    }


}


