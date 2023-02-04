package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class DesktopPage extends Utility {
    By Desktops=By.linkText("Desktops");
    By Sortby=By.xpath("//select[@id=\"products-orderby\"]");
    By Display =By.xpath("//span[(text()='Display')]");
    By SelectProductList=By.xpath("//a[@class='viewmode-icon grid selected']");


    public  void Desktops(){
        Reporter.log("clicking on Desktops"+ Desktops.toString());
        clickOnElement(Desktops);
    }
    public void Sortby(){
        Reporter.log("clicking on sort by"+ Sortby.toString());
        clickOnElement(Sortby);
    }
    public void Display(){
        Reporter.log("clicking on Display"+ Display.toString());
        clickOnElement(Display);
    }
    public void SelectProductList(){
        Reporter.log("clicking on select product list"+ SelectProductList);
        clickOnElement(SelectProductList);
    }


}
