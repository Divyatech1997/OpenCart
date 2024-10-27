package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class StandardClass {

    public static WebDriver driver;

    public StandardClass(WebDriver driver){
        this.driver= StandardClass.driver;
        PageFactory.initElements(StandardClass.driver,this);
    }

    public static void webWait(WebDriver driver, WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void waitUntilClicked( WebDriver driver,WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }


    public static void sleep(int milliSec) throws InterruptedException {
        Thread.sleep(milliSec);
    }

}
