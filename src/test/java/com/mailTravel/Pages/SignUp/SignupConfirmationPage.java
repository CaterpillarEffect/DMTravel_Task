package com.mailTravel.Pages.SignUp;


import com.mailTravel.Utils.BrowserUtils;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignupConfirmationPage extends PageObject {

    @FindBy( xpath = "//div/h2" )
    public WebElement confirmation;

    public boolean confirm() {
        BrowserUtils.waitFor(4);
        WebElement e = getDriver().findElement(By.xpath("//div/h2"));
        return e.isDisplayed();
    }

    public String getConfirmationText() {
        WebElement e = getDriver().findElement(By.xpath("//div/h2"));
        return e.getText();
    }


}
