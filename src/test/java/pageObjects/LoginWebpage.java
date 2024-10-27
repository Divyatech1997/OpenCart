package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginWebpage extends StandardClass {
     public WebDriver driver;
    public LoginWebpage(WebDriver driver){
        super(driver);
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(name="username")
    WebElement username;

    @FindBy(name="password")
    WebElement password;

    @FindBy(xpath="//button[@type='submit']")
    WebElement loginBtn;

    @FindBy(xpath="//p[contains(@class,'forgot')]")
    WebElement forgotBtn;

    public void userNameField(String user) throws InterruptedException {
        //username.sendKeys(Keys.CONTROL+Keys.chord("A")+Keys.DELETE);
        username.clear();
        username.sendKeys(user);
        Thread.sleep(2000);
    }

    public void passWordField(String pw) throws InterruptedException {
        password.clear();
        password.sendKeys(pw);
        Thread.sleep(2000);
            }

    public void login() throws InterruptedException {
        loginBtn.click();
    }

}
