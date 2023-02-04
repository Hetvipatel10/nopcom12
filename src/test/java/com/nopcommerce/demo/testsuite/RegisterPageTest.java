package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import com.nopcommerce.demo.tastbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterPageTest extends TestBase {
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();

    @Test
    public void verifyUserShouldNavigateToRegisterPageSuccessfully() {
        homePage.clickOnRegisterLink();
        String expected = "Register";
        Assert.assertEquals(expected, homePage.VerifyRegisterLink());
    }
    @Test
     public void verifyThatFirstNameLastNameEmailPasswordAndConfirmPasswordFieldsAreMandatory(){
        homePage.clickOnRegisterLink();
        registerPage.ClickonRegisterButton();
        String expectedFirstname = "First name is required.";
        Assert.assertEquals(expectedFirstname, registerPage.VerifyFirstnameError());

        String expectedLastname ="Last name is required.";
        Assert.assertEquals(expectedLastname, registerPage.VerifyLastnameError());

        String expectedEmail="Email is required.";
        Assert.assertEquals(expectedEmail, registerPage.VerifyEmailError());

        String expectedPassword="Password is required.";
        Assert.assertEquals(expectedPassword, registerPage.VerifyPasswordError());

        String expectedConfirmPass ="Password is required.";
        Assert.assertEquals(expectedConfirmPass, registerPage.VerifyConfirmPasswordError());
    }
    @Test
    public void  verifyThatUserShouldCreateAccountSuccessfully(){
        homePage.clickOnRegisterLink();
        registerPage.ClickonFemale();
        registerPage.EnterFirstname("Monika");
        registerPage.EnterLastname("Patel");
        registerPage.SelectDay("15");
        registerPage.SelectMonth("4");
        registerPage.SelectYear("1996");
        registerPage.EnterEmail("monikapatel@gmail.com");
        registerPage.EnterPassword("123456");
        registerPage.EnterConfirmPassword("123456");
        registerPage.ClickonRegisterButton();
        String expected ="Your registration completed";
        Assert.assertEquals(expected, registerPage.VerifyRegisterSuccessfullMsg());
    }
}




