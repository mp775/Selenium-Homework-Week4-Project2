package com.tutorialsninja.pages.myaccount;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class MyAccounts extends Utility {
    By myAccount = By.xpath("//span[contains(text(),'My Account')]");
    By register = By.xpath("//a[contains(text(),'Register')]");
    By login = By.xpath("//body/nav[@id='top']/div[1]/div[2]/ul[1]/li[2]/ul[1]/li[2]/a[1]");
    By firstname = By.id("input-firstname");
    By lastName = By.id("input-lastname");
    By email = By.id("input-email");
    By Telephone = By.id("input-telephone");
    By password = (By.id("input-password"));
    By conformPassword = (By.id("input-confirm"));
    By radiobutton = By.xpath("//body/div[@id='account-register']/div[1]/div[1]/form[1]/fieldset[3]/div[1]/div[1]/label[1]/input[1]");

    By privacyPolicy = By.xpath("//body/div[@id='account-register']/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]");
    By continueButton = By.xpath("//a[contains(text(),'Continue')]");
    // By MyAccount = By.xpath("//span[contains(text(),'My Account')]");
    By continueBtn = By.xpath("//a[contains(text(),'Continue");
    By emailAddress = By.id("input-email");
    By passwordField = By.id("input-password");
    By loginBtn = By.xpath("//form[contains(@action,'login')]//input[@type='submit']");
    By myAccountWebElement = By.xpath("//span[contains(text(),'My Account')]");
    By logOutBtn = (By.xpath("//h1[contains(text(),'Account Logout')]"));
    By checkContinueButton = (By.xpath("//a[contains(text(),'Continue')]"));


    public void clickMyAccount() {
        clickOnElement(myAccount);
    }

    public void clickOnRegister() {
        clickOnElement(register);
    }

    public void clickOnLogin() {
        clickOnElement(login);
    }

    public void enterFirstname() {
        sendTextToElement(firstname, "Prime");
    }

    public void enterLastName() {
        sendTextToElement(lastName, "Patel");
    }

    public void enterEmail() {
        sendTextToElement(email, "bh234@gmail.com");
    }

    public void enterTelephone() {
        sendTextToElement(Telephone, "020345678799");
    }

    public void enterPassword() {
        sendTextToElement(password, "123Prime");
    }

    public void enterConformPassword() {
        sendTextToElement(conformPassword, "123Prime");
    }

    public void clickRadioButton() {
        clickOnElement(radiobutton);
    }

    public void selectPrivacyButton() {
        clickOnElement(privacyPolicy);
    }

    public void clickOnContinueButton() {
        clickOnElement(continueButton);
    }

    public void clickOnElement() {
        clickOnElement(myAccount);
    }

    public void clickOnContinueBtn() {
        clickOnElement(continueBtn);
    }

    public void clickEmailAddress() {
        sendTextToElement(emailAddress, "bh234@gmail.com");
    }

    public void enterPasswordTextField() {
        sendTextToElement(passwordField, "123Prime");
    }

    public void clickOnLoginButton() {
        clickOnElement(loginBtn);
    }

    public void clickOnMyAccount() {
        clickOnElement(myAccountWebElement);
    }

    public void clickOnLogOut() {
        clickOnElement(logOutBtn);
    }

    public void setClickCheckout() {
        clickOnElement(checkContinueButton);
    }
}