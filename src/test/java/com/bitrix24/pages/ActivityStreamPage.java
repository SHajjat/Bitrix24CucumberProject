package com.bitrix24.pages;

import com.bitrix24.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ActivityStreamPage {

    public ActivityStreamPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//*[text()=\"Task\"]")
    public WebElement task;

//    post task selection
    @FindBy(xpath = "//*[@class=\"task-info-panel-title\"]")
    public WebElement taskTitle;

    @FindBy(xpath = "//div[@class=\"task-info\"]//div[@class=\"bx-html-editor\"]")
    public WebElement taskContent;

//    elements regarding deadlines
    @FindBy(xpath = "//div[@class=\"task-options-item-more\"]//input[@type=\"text\"]")
    public WebElement deadline;

    @FindBy(xpath = "//a[@class=\"bx-calendar-top-month\"]")
    public WebElement dlMonth;

    @FindBys(@FindBy (xpath = "//span[contains(@class, \"bx-calendar-month\")]"))
    public List<WebElement> dlMonthOptions;

    @FindBy(xpath = "//a[@class=\"bx-calendar-top-year\"]")
    public WebElement dlYear;

    @FindBys(@FindBy (xpath = "//span[contains(@class, \"bx-calendar-year-number\")]"))
    public List<WebElement> dlYearOptions;

    @FindBys(@FindBy (xpath = "//a[contains(@class, \"bx-calendar-cell\")]"))
    public List<WebElement> dlDays;

    @FindBy(xpath = "//div[@class = \"bx-calendar-set-time-wrap bx-calendar-set-time-opened\"]//input[1]")
    public WebElement dlHour;

    @FindBy(xpath = "//div[@class = \"bx-calendar-set-time-wrap bx-calendar-set-time-opened\"]//input[2]")
    public WebElement dlMin;

    @FindBy(xpath = "//div[@class = \"task-info\"]//span[@title = \"Upload files\"]")
    public WebElement upload;

    @FindBy(xpath = "//span[text()=\"Checklist\"]")
    public WebElement checkList;

    @FindBy(xpath = "//input[@class=\"js-id-checklist-is-form-title task-checklist-field-add\"]")
    public WebElement checkListContent;

    @FindBy(xpath = "//span[text()=\"Select\"]")
    public WebElement dlSubmit;


    //submit button
    @FindBy(xpath = "//button[@id = \"blog-submit-button-save\"]")
    public WebElement send;

    public void navigateToTask(){
        task.click();
    }

    public void setTaskTitle(String str){
        taskTitle.clear();
        taskTitle.sendKeys("str");
    }

    public void setTaskContent(String str){
        taskContent.clear();
        taskContent.sendKeys(str);
    }


    public void setCheckList(String ...str){
        checkList.click();

        for (String s : str){
            checkListContent.sendKeys(s + Keys.ENTER);
        }

    }


    public void setCheckList(String str){
        checkList.click();
        checkListContent.sendKeys(str + Keys.ENTER);

    }

    public void setDeadline(){
        deadline.click();
        dlSubmit.click();
    }

    public void setDeadline(String month, String day, String year){
        deadline.click();

        dlMonth.click();
        for(WebElement option: dlMonthOptions){
            if (option.getText().equalsIgnoreCase(month)){
                option.click();
            }
        }

        dlYear.click();
        for(WebElement option: dlYearOptions){
            if (option.getText().equalsIgnoreCase(year)){
                option.click();
            }
        }

        for(WebElement option: dlDays){
            if (option.getText().equalsIgnoreCase(day)){
                option.click();
            }
        }

        dlSubmit.click();
    }



    public void submitTask(){
        send.click();
    }





}
