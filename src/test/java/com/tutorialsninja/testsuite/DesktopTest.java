package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.desktops.Desktops;
import com.tutorialsninja.pages.homepage.TopMenu;
import com.tutorialsninja.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class DesktopTest extends BaseTest {

    List<String> originalProductsName;
    List<String> afterSortByZToAProductsName;
    Desktops desktop = new Desktops();
    TopMenu menu = new TopMenu();


    @Test
    public void verifyProductArrangeInReverseAlphaBaticalOrder() {
        menu.clickOnDesktopTab();
        menu.selectMenu("Show AllDesktops");
        desktop.productNameListBeforeFilter();
        desktop.selectSortByPositionZToA();
        desktop.productNameListAfterFilter();
        Assert.assertEquals(afterSortByZToAProductsName, originalProductsName, "Product is not displayed in descending order");
    }

    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() {
        menu.clickOnDesktopTab();
        menu.selectMenu("Show AllDesktops");
        desktop.selectSortByPositionAToZ();
        desktop.selectProduct();
        String actualProduct = "HP LP3065";
        String expectedProduct = getTextFromElement(By.xpath("//a[contains(text(),'HP LP3065')]"));
        Assert.assertEquals(actualProduct, expectedProduct, "HP LP3065 is not display");
        desktop.selectProduct();
        desktop.selectDate();
        desktop.selectAllDate();
        desktop.enterQuantity();
        desktop.clickOnAddToCartButton();
        String expectedPrintMessage = "Success: You have added HP LP3065 to your shopping cart!";
        String actualPrintMessage = getTextFromElement(By.cssSelector("body:nth-child(2) div.container:nth-child(4) > div.alert.alert-success.alert-dismissible"));
        Assert.assertEquals(actualPrintMessage, expectedPrintMessage, "Product not add to cart");
        String expectedShoppingCart = "Shopping Cart";
        String actualShoppingCart = getTextFromElement(By.xpath("//div[@id='content']//h1"));
        Assert.assertEquals(actualShoppingCart, expectedShoppingCart, "Product name not display");
        String expectedDeliveryDate = "2022-11-30";
        String actualDeliveryDate = getTextFromElement(By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[2]/small[1]\")).contains(\"2023-11-30\"));"));
        Assert.assertEquals(actualDeliveryDate, expectedDeliveryDate, "Delivery date is not display");
        String expectedVerifyProduct = "Product21";
        String actualVerifyProduct = getTextFromElement(By.xpath("//td[contains(text(),'Product 21')]"));
        Assert.assertEquals(actualVerifyProduct, expectedVerifyProduct, "Model not matches");
        String expectedCost = "£74.73";
        String actualCost = getTextFromElement(By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[6]"));
        Assert.assertEquals(actualCost, expectedCost, "Total not match");
    }
}