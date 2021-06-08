package com.mailTravel.Pages.BookPackage;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentDetailsPage extends PageObject {

    @FindBy( xpath = "(//h2[@class='nbf_fancyimg_paymentpage_h2'])[1]" )
    public WebElement paymentHeader;
}
