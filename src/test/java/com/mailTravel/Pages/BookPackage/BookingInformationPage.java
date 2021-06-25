package com.mailTravel.Pages.BookPackage;


import com.mailTravel.Utils.BrowserUtils;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class BookingInformationPage extends PageObject {

    public WebElement Dateselected() {


        BrowserUtils.waitFor(5);
        WebElement e = getDriver().findElement(By.name("seldate"));

        return e;

    }
    public String DepatureDate() {
        WebElement e = Dateselected();
       String  depatureDate = e.getAttribute("data-formattedstartdate");
        return  depatureDate;
    }

}
