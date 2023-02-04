package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class HomePage extends Utility {
    By loginLink = By.linkText("Log in");
    By registerLink = By.linkText("Register");
    By logoLink = By.linkText("nopCommerce");
    By myAccountLink = By.linkText("my Account Link");
    By LogOutLink = By.linkText("Logout Link");
    By Computers = By.linkText("Computers");
    By Digitaldownloads = By.linkText("Digitaldownloads");
    By Electronics = By.linkText("Electronics");
    By Apparel = By.linkText("Apparel");
    By Books = By.linkText("Books");
    By Jewelery = By.linkText("Jewelery");
    By GiftCards = By.linkText("GiftCards");


    public void clickOnLoginLink() {
        Reporter.log("Clicking on login button " + loginLink.toString());
        clickOnElement(loginLink);
    }

    public void clickOnRegisterLink() {
        Reporter.log("Click on register link " + registerLink.toString());
        clickOnElement(registerLink);
    }

    public void clickOnlogoLink() {
        Reporter.log("clicking on logolink " + logoLink.toString());
        clickOnElement(loginLink);
    }

    public void clickOnMyAccountLink() {
        Reporter.log("clicking on myaccountLink" + myAccountLink.toString());
        clickOnElement(myAccountLink);
    }

    public void clickOnLogOutLink() {
        Reporter.log("clicking on LogOutLink" + LogOutLink.toString());
        clickOnElement(LogOutLink);
    }

    public void clickOnComputers() {
        Reporter.log("clicking on Computers" + Computers.toString());
        clickOnElement(Computers);
    }

    public void clickOnElectronics() {
        Reporter.log("clicking on Electronics" + Electronics.toString());
        clickOnElement(Electronics);
    }

    public void Apparel() {
        Reporter.log("clicking on Apparel" + Apparel.toString());
        clickOnElement(Apparel);
    }

    public void clickOnDigitaldownloads() {
        Reporter.log("clicking on Digitaldownloads" + Digitaldownloads.toString());
        clickOnElement(Digitaldownloads);
    }

    public void clickOnBooks() {
        Reporter.log("clicking on Books" + Books.toString());
        clickOnElement(Books);
    }

    public void clickOnJewelery() {
        Reporter.log("clicling on Jewelery" + Jewelery.toString());
        clickOnElement(Jewelery);
    }

    public void clickOnGiftCards() {
        Reporter.log("clicking on GiftCards" + GiftCards.toString());
        clickOnElement(GiftCards);
    }


    public String VerifyRegisterLink() {
        return getTextFromElement(registerLink);
    }
    public String VerifyComputersText(){
        return  getTextFromElement(this.Computers);
    }
    public String VerifyLoginlink(){
        return getTextFromElement(loginLink);
    }
}
