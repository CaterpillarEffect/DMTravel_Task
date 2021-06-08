package com.mailTravel.Pages.BookPackage;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class PassengerDetailsPage extends PageObject {

    @FindBy( id = "pax-a-title-1" )
    public WebElement titlePass1;

    @FindBy( id = "pax-a-dobd-1" )
    public WebElement pax1Dobd;
    @FindBy( id = "pax-a-dobm-1" )
    public WebElement pax1Dobm;
    @FindBy( id = "pax-a-doby-1" )
    public WebElement pax1Doby;

    @FindBy( id = "pax-a-first-1" )
    public WebElement pax1FirstName;

    @FindBy( id = "pax-a-last-1" )
    public WebElement pax1LastName;
    @FindBy( id = "pax-a-title-2" )
    public WebElement titlePass2;

    @FindBy( id = "pax-a-dobd-2" )
    public WebElement pax2Dobd;
    @FindBy( id = "pax-a-dobm-2" )
    public WebElement pax2Dobm;
    @FindBy( id = "pax-a-doby-2" )
    public WebElement pax2Doby;
    @FindBy( id = "contact-name" )
    public WebElement contactName;
    @FindBy( id = "contact-mobile" )
    public WebElement contactMobile;
    @FindBy( id = "contact-email" )
    public WebElement contactEmail;
    @FindBy( id = "contact-address1" )
    public WebElement contactAddress1;
    @FindBy( id = "contact-address2" )
    public WebElement contactAddress2;
    @FindBy( id = "contact-city" )
    public WebElement contactCity;
    @FindBy( id = "contact-postcode" )
    public WebElement postCode;
    @FindBy( xpath = "//div[contains(text(),'Continue')]" )
    public WebElement continueBtn;


    @FindBy( id = "pax-a-first-2" )
    public WebElement pax2FirstName;

    @FindBy( id = "pax-a-last-2" )
    public WebElement pax2LastName;

    public void selectTitleLeadPax(String value, WebElement e) {
        Select select = new Select(e);

        select.selectByValue(value);
    }

    public void selectTitleLeadPax(WebElement e) {
        Select select = new Select(e);
        select.selectByIndex(3);
    }


    public void enterText(WebElement e, String s) {
        e.sendKeys(s);
    }

}


