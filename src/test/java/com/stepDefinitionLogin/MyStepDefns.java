package com.stepDefinitionLogin;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import myHooks.CucumberHooks;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.DashboardPage;
import pageObjects.LoginWebpage;

import java.time.Duration;

import static myHooks.CucumberHooks.driver;

public class MyStepDefns {
    public LoginWebpage login;
    public DashboardPage dash;


    @When("Enter valid username {string}")
    public void enterValidUsername(String user) throws InterruptedException {
        login=new LoginWebpage(driver);
        login.userNameField(user);
    }

    @And("Enter valid password {string}")
    public void enterValidPassword(String pw) throws InterruptedException {
        login.passWordField(pw);
    }

    @And("Click login field")
    public void clickLoginField() throws InterruptedException {
        login.login();
    }

    @Then("User can able to go to {string} page")
    public void userCanAbleToGoToPage(String page) {
        dash=new DashboardPage(driver);
        String actual=dash.dashBoardPage_Title();
        String expected=page;
        Assert.assertEquals(actual,expected);
    }

    @Given("Open the application url {string}")
    public void openTheApplicationUrl(String url) {
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }


    @And("Close the Browser")
    public void closeTheBrowser() {
        driver.close();
    }
}
