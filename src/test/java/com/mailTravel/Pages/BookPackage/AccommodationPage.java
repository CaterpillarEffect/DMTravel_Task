package com.mailTravel.Pages.BookPackage;

import com.mailTravel.Utils.BrowserUtils;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AccommodationPage extends PageObject {

    @FindBy( id = "room-0-numselect" )
    public WebElement StandardRoom;
    @FindBy( xpath = "//div[contains(text(),'Select your room and continue')]" )
    public WebElement Continue;

    public void selectStandardRoom(String s) {
        Select select = new Select(StandardRoom);
        if (!s.contains("2 adults")) {
            select.selectByValue(s);
        }
    }


    public void clickBtn(String b) {
        String before = "//div[contains(text(),'";
        String after = "')]";
        String xpath = before + b + after;
        BrowserUtils.waitForClickablility(By.xpath(xpath), 20);
        getDriver().findElement(By.xpath(xpath)).click();


    }

}
