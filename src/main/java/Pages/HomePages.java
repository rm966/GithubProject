package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static ObjectsPath.HomePaths.*;


public class HomePages {

    WebDriver driver = null;

    public HomePages (WebDriver driver){
        this.driver = driver;
    }
    public void clickOnNewRepo(){
        WebElement NewRepo = driver.findElement(newRepBtn);
        NewRepo.click();
    }

    public void fillRepoName(){
        WebElement RepoName = driver.findElement(repName);
        RepoName.sendKeys("automation");
    }

    public void clickOnCreateRepo(){
        WebElement CreateRepo = driver.findElement(createRepo);
        CreateRepo.click();
    }

    public void scrollToPosition(int x, int y) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(arguments[0], arguments[1]);", x, y);
        //Using JavaScript for Scrolling via Selenium
    }
}
