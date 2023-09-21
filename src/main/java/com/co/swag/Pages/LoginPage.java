package com.co.swag.Pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://www.saucedemo.com/")

public class LoginPage extends PageObject {

    By TXT_USER= By.xpath("//input[@id='user-name']");
    By TXT_PASS= By.xpath("//input[@id='password']");
    By BTN_LOGIN= By.xpath("//input[@id='login-button']");
    By TXT_PRODUCTOS= By.xpath("//span[text()='Products']");

    public By getTXT_USER() {
        return TXT_USER;
    }

    public void setTXT_USER(By TXT_USER) {
        this.TXT_USER = TXT_USER;
    }

    public By getTXT_PASS() {
        return TXT_PASS;
    }

    public void setTXT_PASS(By TXT_PASS) {
        this.TXT_PASS = TXT_PASS;
    }

    public By getBTN_LOGIN() {
        return BTN_LOGIN;
    }

    public void setBTN_LOGIN(By BTN_LOGIN) {
        this.BTN_LOGIN = BTN_LOGIN;
    }

    public By getTXT_PRODUCTOS() {
        return TXT_PRODUCTOS;
    }

    public void setTXT_PRODUCTOS(By TXT_PRODUCTOS) {
        this.TXT_PRODUCTOS = TXT_PRODUCTOS;
    }
}
