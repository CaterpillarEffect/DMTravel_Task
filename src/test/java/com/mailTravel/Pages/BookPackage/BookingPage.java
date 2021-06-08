package com.mailTravel.Pages.BookPackage;


import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class BookingPage extends PageObject {
    public void dropdownseleted() {

        WebElement dropdownElement = getDriver().findElement(By.id("departure-select-98f14691e2018479869775ac1879f0dd"));

        Select departureDropdown = new Select(dropdownElement);

        departureDropdown.selectByVisibleText("London Heathrow (LHR) ");


    }

    public void clickBookonlinebtn() {
        WebElement btn = getDriver().findElement(By.xpath("(//*[contains(text(),'Continue' )])[2]"));
        btn.click();
    }
}
