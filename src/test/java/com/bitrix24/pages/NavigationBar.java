package com.bitrix24.pages;

import com.bitrix24.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public abstract class NavigationBar {


    public NavigationBar (){
        PageFactory.initElements(Driver.get(),this);}

        public static void navigateTo (String tab){
            WebElement button = Driver.get().findElement(By.linkText(tab));
            button.click();
            //TODO
            //Assert.assertTrue(Driver.get().getTitle().contains(tab));



        }
    }



