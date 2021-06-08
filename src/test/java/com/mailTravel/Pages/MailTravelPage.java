package com.mailTravel.Pages;

import com.mailTravel.Utils.BrowserUtils;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

@DefaultUrl( "https://www.mailtravel.co.uk/" )
public class MailTravelPage extends PageObject {

    public void enterSearchTerm(String search) {
        $("#searchtext_freetext_search_form")
                .sendKeys(search, Keys.ENTER);
    }

    public void closeCookies() {
        WebElementFacade cookies = $("//button[@title='Close']");

        if (cookies.isPresent()) {
            BrowserUtils.waitForClickablility(By.xpath("//button[@title='Close']"), 100);

            $("//button[@title='Close']")
                    .click();

        }

    }

    public void clickSignup() {
        getDriver().findElement(By.id("reassurance-bar-iter_4_top-bar-text")).click();
        // $(By.id("reassurance-bar-iter_4_top-bar-text")).click();
    }
}
