package com.bitrix24.step_definitions;

import com.bitrix24.utilities.Driver;
import com.bitrix24.utilities.Pages;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActivityStreamStepDef {
    Pages page = new Pages();
    WebDriver driver = Driver.get();
    WebDriverWait wait;
    String ThingsToDo ="team work";
    String body = "This is what Jonghee did , you can thank";

    @Then("I should be able to Create a TASK")
    public void i_should_be_able_to_Create_a_TASK() throws InterruptedException {
        page.getActivityStreamPage().task.click();
        page.getActivityStreamPage().setTaskTitle(ThingsToDo);
        page.getActivityStreamPage().switchWitch(body);
        page.getActivityStreamPage().submitTask();
        //page.getActivityStreamPage().send.click();


    }


    @Then("TASK created should be Displayed on {string}")
    public void task_created_should_be_Displayed_on(String string) {
        // Write code here that turns the phrase above into concrete actions
        //throw new cucumber.api.PendingException();
    }

}
