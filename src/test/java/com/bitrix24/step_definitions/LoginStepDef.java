package com.bitrix24.step_definitions;

import com.bitrix24.pages.NavigationBar;
import com.bitrix24.utilities.ConfigurationReader;
import com.bitrix24.utilities.Driver;
import com.bitrix24.utilities.Pages;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginStepDef {
    Pages pages = new Pages();
    WebDriver driver = Driver.get();
    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
      driver.get(ConfigurationReader.get("url"));
    }

    @When("I login as a {string}")
    public void i_login_as_a(String user) {
        pages.getLoginPage().userButton.sendKeys(ConfigurationReader.get(user+"_username"));
        pages.getLoginPage().passwordButton.sendKeys(ConfigurationReader.get(user+"_password"));
        pages.getLoginPage().loginButton.click();


    }

    @When("I navigate to {string}")
    public void i_navigate_to(String tab) {
        NavigationBar.navigateTo(tab);

    }

    @Then("I should be able to see {string} page")
    public void i_should_be_able_to_see_page(String title) {
        WebElement pageTitle = driver.findElement(By.cssSelector("#pagetitle"));
        String strTitle =pageTitle.getText().toLowerCase();
        Assert.assertTrue(strTitle.contains(title.toLowerCase()));

    }


}
