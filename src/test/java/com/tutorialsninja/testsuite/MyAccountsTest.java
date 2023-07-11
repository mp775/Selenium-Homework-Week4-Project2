package com.tutorialsninja.testsuite;
import com.tutorialsninja.pages.myaccount.MyAccounts;
import com.tutorialsninja.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyAccountsTest extends BaseTest {
    MyAccounts account = new MyAccounts();

    @Test
    public void verifyUserShouldNavigateToRegisterPageSuccessfully() {
        account.clickMyAccount();
        account.clickOnRegister();
        String actualRegister = "Register Account";
        String expectedRegister = getTextFromElement(By.xpath("//h1[contains(text(),'Register Account')]"));
        Assert.assertEquals(actualRegister, expectedRegister, "Register page Dispaly");
    }

    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully() {
        account.clickMyAccount();
        account.clickOnLogin();
        String actualReturning = "Returning Customer";
        String expectedReturning = getTextFromElement(By.xpath("//h2[contains(text(),'Returning Customer')]"));
        Assert.assertEquals(actualReturning, expectedReturning, "Returning is not Display");
    }

    @Test
    public void verifyThatUserRegisterAccountSuccessfully() {
        account.clickMyAccount();
        account.clickOnRegister();
        account.enterFirstname();
        account.enterLastName();
        account.enterEmail();
        account.enterTelephone();
        account.enterPassword();
        account.enterConformPassword();
        account.clickRadioButton();
        account.selectPrivacyButton();
        String actualverifyMessage = "Your Account Has Been Created!";
        String expectedVerifyMessage = getTextFromElement(By.xpath("//h1[contains(text(),'Your Account Has Been Created!')]"));
        Assert.assertEquals(actualverifyMessage, expectedVerifyMessage, "Your Account Has Been Created");
        account.clickOnContinueButton();
        account.clickOnElement();
        String actualMessage = "Account Logout";
        String expectedMessage = getTextFromElement(By.xpath("//h1[contains(text(),'Account Logout')]"));
        Assert.assertEquals(actualMessage, expectedMessage, "Account LogOut");
        account.clickOnContinueBtn();

    }

    @Test
    public void verifyThatUserShouldLoginAndLogoutSuccessfully() {
        account.clickMyAccount();
        account.clickOnLogin();
        account.clickEmailAddress();
        account.enterPasswordTextField();
        account.clickOnLoginButton();
        account.clickOnMyAccount();
        String actualMessage = "Account Logout";
        String expectedMesage = getTextFromElement(By.xpath("//h1[contains(text(),'Account Logout')]"));
        Assert.assertEquals(actualMessage, expectedMesage, "Not logged out");
        account.clickOnLogOut();
        account.setClickCheckout();

    }
}