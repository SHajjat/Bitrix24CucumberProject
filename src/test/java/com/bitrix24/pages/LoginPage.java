package com.bitrix24.pages;

import com.bitrix24.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.security.PublicKey;

public class LoginPage {
public LoginPage (){
    PageFactory.initElements(Driver.get(), this);

}

@FindBy (name = "USER_LOGIN")
    public WebElement userButton;

@FindBy (name = "USER_PASSWORD" )
    public  WebElement passwordButton;

@FindBy (id = "USER_REMEBER")
    public WebElement rememberme;

@FindBy (css = ".login-btn")
    public WebElement loginButton;

@FindBy (linkText = "FORGOT YOUR PASSWORD?")
        public WebElement forgotButton;
}
