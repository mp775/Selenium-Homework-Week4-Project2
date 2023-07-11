package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.homepage.TopMenu;
import com.tutorialsninja.pages.notebooks.LaptopsAndNotebooks;
import com.tutorialsninja.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class LaptopsAndNotebooksTest extends BaseTest {
    List<String> originalProductsName;
    List<String> afterSortByProductsName;
    TopMenu menu = new TopMenu();
    LaptopsAndNotebooks book = new LaptopsAndNotebooks();

    @Test
    public void verifyProductsPriceDisplayHighToLowSuccessfully() {
        menu.clickOnLaptopsNotebooks();
        menu.selectMenu("Show AllLaptops & Notebooks");
        book.sortByPrise();
        book.reverseOrder();
        Assert.assertEquals(originalProductsName, afterSortByProductsName, "Product not sorted high to low");

    }

    @Test
    public void verifyThatUserPlaceOrderSuccessfully() {
        menu.clickOnLaptopsNotebooks();
        menu.selectMenu("Show AllLaptops & Notebooks");
        book.setProductMacbook();
        String actualMacbookText = "MacBook";
        String expectedMacbookText = getTextFromElement(By.xpath("//h1[contains(text(),'MacBook')]"));
        Assert.assertEquals(actualMacbookText, expectedMacbookText, "MacBook Product not display");
        book.clickCartButton();
        String actualverifymessage = "Success: You have added MacBook to your shopping cart!”";
        String expectedverifymessage = getTextFromElement(By.xpath("//button[@id='button-cart']"));
        Assert.assertEquals(actualverifymessage, expectedverifymessage, "Product not added to cart");
        book.clickShoppingCart();
        String actualMacbookProduct = "MacBook";
        String expectedMacbookProduct = getTextFromElement(By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[2]/a"));
        Assert.assertEquals(actualMacbookProduct, expectedMacbookProduct, "Product name not matched");
        book.setChangeQty2();
        book.setUpdateTab();
        String actualMessageOnDisplay = "Success: You have modified your shopping cart!";
        String expectedMessageOnDispaly = getTextFromElement(By.xpath("//div[@id='checkout-cart']/div[1]"));
        Assert.assertEquals(actualMessageOnDisplay, expectedMessageOnDispaly, "Cart not modified");
        String totalmatches = "£737.45";
        String totalMatches = getTextFromElement(By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[6]"));
        Assert.assertEquals(totalmatches, totalmatches, "Total not matched");
        book.verifyClickOnCheckOutButton();
        String checkoutbutton = "Checkout";
        String checkOutButtoninPage = getTextFromElement(By.xpath("//a[contains(text(),'Checkout')]"));
        Assert.assertEquals(checkoutbutton, checkOutButtoninPage, "Button is not working");
        String newCustomer = "New Customer";
        String expectednewcustomer = getTextFromElement(By.xpath("//h2[contains(text(),'New Customer')]"));
        book.clickOnGuestButton();
        book.clickContinueButton();

    }
}