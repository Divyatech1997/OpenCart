package pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;
import java.util.List;

public class AdminPage extends StandardClass {

    WebDriver driver;
    public AdminPage(WebDriver driver){
        super(driver);
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input")
    WebElement username;

    @FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div")
    WebElement user_role;

    @FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div/input")
    WebElement employeeName;

    @FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div[2]/div/div")
    WebElement status;

    @FindBy(xpath="//*[@type='submit']")
    WebElement search;

    @FindBy(xpath = "//*[contains(@class,'ghost')]")
    WebElement reset;

    @FindBy(xpath="//*[@class='orangehrm-header-container'] //*[@type='button']")
    WebElement add_plus_btn;

    @FindBy(xpath = "//*[@class='oxd-form-row']/div/div[1]/div/div[2]")
    WebElement add_User_Role;

    @FindBy(xpath = "//*[@class='oxd-form-row']/div/div[2]/div/div[2]")
    WebElement add_employee_name;

    @FindBy(xpath = "//*[@class='oxd-form-row']/div/div[3]/div/div[2]")
    WebElement add_status;

    @FindBy(xpath = "//*[@class='oxd-form-row']/div/div[4]/div/div[2]")
    WebElement add_username;

    @FindBy(xpath = "//*[contains(@class,'user-password-row')]/div/div[1]/div/div[2]")
    WebElement add_password;

    @FindBy(xpath = "//*[contains(@class,'user-password-row')]/div/div[2]/div/div[2]")
    WebElement add_confirm_password;

    @FindBy(xpath="//*[contains(@class,'orangehrm-left-space')]")
    WebElement add_save;

    @FindBy(xpath="//*[contains(@class,'oxd-button--ghost')]")
    WebElement add_cancel;

    @FindBy(xpath="//*[@role='table']/div[2]/div/div/div[4]")
    List<WebElement> Record_Column_EmployeeName;

    @FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6[1]")
    WebElement Admin_PageTitle;

    @FindBy(xpath = "//*[@role='option']")
    List<WebElement> user_role_Options;

    @FindBy(xpath = "//*[@role='option']")
    List<WebElement> employeeName_Options;

    @FindBy(xpath = "//*[@role='option']")
    List<WebElement> status_Options;

    //AdminPage
    public String admin_pageTitle(){
       return Admin_PageTitle.getText();
    }

    //System users
    public void verify_Username(String user){
        webWait(driver,username);
        username.sendKeys(user);
    }

    public void verify_User_role(String userRole) throws InterruptedException {
        user_role.click();
        sleep(2000);
        for(WebElement opt:user_role_Options){
            if(opt.getText().equalsIgnoreCase(userRole)){
                opt.click();
            }
        }
       }

    public void verify_EmployeeName(String employee_val) throws InterruptedException {
        webWait(driver,employeeName);
        employeeName.sendKeys(employee_val);
        sleep(3000);
        for(WebElement employee: user_role_Options){
            if(employee.getText().equalsIgnoreCase(employee_val)){
                employee.click();
            }
        }
    }

    public void verify_Status(String status_val) throws InterruptedException {

        status.click();
        sleep(2000);
        for(WebElement status:status_Options){
            if(status.getText().equalsIgnoreCase(status_val)){
                status.click();
            }
        }}
    public void system_user_search() throws InterruptedException {
        sleep(3000);
        search.click();
        sleep(6000);

    }

    //Record Table
    public boolean Record_EmployeeName(String employee){
        boolean status = false;
        for (WebElement element : Record_Column_EmployeeName) {
            if (element.getText().contains(employee)) {
                System.out.println(element.getText());
                status = true;
            }
        }
        return status;
    }

    //Add user details
    public void setAdd_user_plusBtn() throws InterruptedException {
        add_plus_btn.click();
        sleep(4000);
    }



















}

