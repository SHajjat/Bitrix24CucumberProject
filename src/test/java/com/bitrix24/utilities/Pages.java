package com.bitrix24.utilities;

import com.bitrix24.pages.LoginPage;

public class Pages {
    private LoginPage loginPage;
    public LoginPage getLoginPage(){
        if(loginPage==null){
            loginPage = new LoginPage();
        }
        return loginPage;
    }



}
