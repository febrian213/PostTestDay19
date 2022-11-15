package com.juaracoding.pages;

import io.appium.java_client.AppiumCommandInfo;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.PageFactory;
public class Calculator {

    private AndroidDriver<MobileElement> driver;

    public Calculator(AndroidDriver<MobileElement> driver){

        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }
    By btnSatu = By.id("com.google.android.calculator:id/digit_1");
    By btnDua = By.id("com.google.android.calculator:id/digit_2");
    By btnTambah = By.id("com.google.android.calculator:id/op_add");
    By btnKali = By.id("com.google.android.calculator:id/op_mul");
    By btnSamaDengan = By.id("com.google.android.calculator:id/eq");
    By hasil = By.id("com.google.android.calculator:id/result_final");

    public void calcTambah(){
        driver.findElement(btnSatu).click();
        driver.findElement(btnTambah).click();
        driver.findElement(btnDua).click();
        driver.findElement(btnSamaDengan);
    }
    public void calcKali(){
        driver.findElement(btnSatu).click();
        driver.findElement(btnKali).click();
        driver.findElement(btnDua).click();
        driver.findElement(btnSamaDengan);
    }

    public String getTxtResult(){
        return driver.findElement(hasil).getText();
    }
}
