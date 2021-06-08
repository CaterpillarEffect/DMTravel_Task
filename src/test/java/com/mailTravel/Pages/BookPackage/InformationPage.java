package com.mailTravel.Pages.BookPackage;


import com.mailTravel.Utils.BrowserUtils;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class InformationPage extends PageObject {

    @FindBy( id = "product-title" )
    public WebElement TourTitle;

    @FindBy( id = "price-pin_days-num-01" )
    public WebElement NumDays;

    @FindBy( xpath = "//span[@class ='ibecurr']" )
    public WebElement TourPrice;

    @FindBy( xpath = "//a[@id=\"supplier-phone\"]" )
    public WebElement TourPhone;

    @FindBy( linkText = "Itinerary" )
    public WebElement Itinerary_link;

    @FindBy( className = "nbf_tpl_pms_book_button" )
    public WebElement bookBtn;

    public WebElement getWebelement(String s) {
        waitFor(0);
        WebElement e = null;
        switch (s) {
            case ("days"):
                e = NumDays;
                return NumDays;

            case ("price"):
                e = TourPrice;
                break;
            case ("phoneNumber"):
                e = TourPhone;
                break;
        }
        return e;

    }

    public boolean InfoisDisplayed(WebElement e) {
        boolean flag = false;
        if (e.isDisplayed()) {
            flag = true;
        }
        return flag;
    }

    public boolean IternarycontainsText() {
        boolean flag = true;

        List<WebElement> Iternary = getDriver().findElements(By.className("day-text"));
        List<WebElement> DayButton = getDriver().findElements(By.className("day-button"));

        DayButton.remove(0);

        for (WebElement webElement : DayButton) {

            BrowserUtils.clickWithJS(webElement);


        }
        for (WebElement webElement : Iternary) {

            String text = webElement.getText();
            if (text.length() == -1 || !webElement.isDisplayed()) {
                return false;
            }


        }
        return flag;

    }

    public void clickBtn(String s) {
        WebElement Btn = getDriver().findElement(By.xpath("//div[contains(text(),\"" + s + "\")]"));
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,1000)");
        BrowserUtils.clickWithJS(Btn);
    }


    public void clickBookbtn() {
        BrowserUtils.clickWithJS(bookBtn);
    }

    public void Transportbtnclick() {
        BrowserUtils.waitFor(6);
        WebElement e = getDriver().findElement(By.xpath("//*[@id=\"transportForm-container\"]/div[1]/div[1]/div"));
        BrowserUtils.clickWithJS(e);
    }

}

