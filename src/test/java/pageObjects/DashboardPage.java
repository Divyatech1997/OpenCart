package pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage extends StandardClass {

    WebDriver driver;
    public DashboardPage(WebDriver driver){
        super(driver);
        this.driver=driver;
        PageFactory.initElements(driver,this);

        }

    @FindBy(xpath="//*[@class='oxd-main-menu']/li[1]")
    WebElement admin_module;

    @FindBy(xpath="//*[@class='oxd-main-menu']/li[2]")
    WebElement PIM_module;

    @FindBy(xpath="//*[@class='oxd-main-menu']/li[3]")
    WebElement Leave_module;

    @FindBy(xpath="//*[@class='oxd-main-menu']/li[4]")
    WebElement Time_module;

    @FindBy(xpath="//*[@class='oxd-main-menu']/li[5]")
    WebElement Recruitment_module;

    @FindBy(xpath="//*[@class='oxd-main-menu']/li[6]")
    WebElement MyInfo_module;

    @FindBy(xpath="//*[@class='oxd-main-menu']/li[7]")
    WebElement Performance_module;

    @FindBy(xpath="//*[@class='oxd-main-menu']/li[8]")
    WebElement Dashboard_module;

    @FindBy(xpath="//*[@class='oxd-main-menu']/li[9]")
    WebElement Directory_module;

    @FindBy(xpath="//*[@class='oxd-main-menu']/li[10]")
    WebElement Maintenance_module;

    @FindBy(xpath="//*[@class='oxd-main-menu']/li[11]")
    WebElement Claim_module;

    @FindBy(xpath="//*[@class='oxd-main-menu']/li[12]")
    WebElement Buzz_module;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6")
    WebElement pageTitle;

    public String dashBoardPage_Title(){
        webWait(driver,pageTitle);
       return pageTitle.getText();

    }

    public void admin_module(){
        admin_module.click();
    }




}
