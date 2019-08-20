package com.bitrix24.utilities;

import com.bitrix24.pages.ActivityStreamPage;
import com.bitrix24.pages.LoginPage;

public class Pages {
    private LoginPage loginPage;
    private ActivityStreamPage activityStreamPage;
    public LoginPage getLoginPage(){
        if(loginPage==null){
            loginPage = new LoginPage();
        }
        return loginPage;
    }
    public ActivityStreamPage getActivityStreamPage(){
        if(activityStreamPage==null){
            activityStreamPage = new ActivityStreamPage();
        }
        return activityStreamPage;
    }


}
