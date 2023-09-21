package com.co.swag.Steps;

import com.co.swag.Models.LoginData;
import com.co.swag.Pages.LoginPage;
import net.thucydides.core.annotations.Step;

public class LoginStep {
    LoginPage loginPage;
    @Step
    public void OpenPage(){
        loginPage.open();
    }
    @Step
    public void enterUser(String user){
        loginPage.getDriver().findElement(loginPage.getTXT_USER()).sendKeys(user);
        try {Thread.sleep(3000);} catch (InterruptedException e) {throw new RuntimeException(e);
        }
    }
    @Step
    public void enterPass(String pass){
        loginPage.getDriver().findElement(loginPage.getTXT_PASS()).sendKeys(pass);
        try {Thread.sleep(3000);} catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    @Step
    public void enterLogin(){
        loginPage.getDriver().findElement(loginPage.getBTN_LOGIN()).click();
    }

}
