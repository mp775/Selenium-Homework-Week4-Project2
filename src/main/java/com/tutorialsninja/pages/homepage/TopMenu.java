package com.tutorialsninja.pages.homepage;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TopMenu extends Utility {
    By desktop = By.linkText("Desktops");
    By laptopAndNotebook = (By.linkText("Laptops & Notebooks"));
    By ShowAllComponents = By.linkText("Show AllComponents");


    public void clickOnDesktopTab() {
        clickOnElement(desktop);
    }

    public void selectMenu(String menu) {
        List<WebElement> topMenuList = getListOfElements(By.xpath("//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*"));
        try {
            for (WebElement element : topMenuList) {
                if (element.getText().equalsIgnoreCase(menu)) {
                    element.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            topMenuList = getListOfElements(By.xpath("//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*"));
        }
    }

    public void clickOnLaptopsNotebooks() {
        clickOnElement(laptopAndNotebook);
    }

    public void getcomonentelement() {
        clickOnElement(ShowAllComponents);
    }


}

