package com.mailTravel.Pages;

import com.mailTravel.Utils.BrowserUtils;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ResultsPage extends PageObject {
    String prepathResultxpath = "iterator_";
    String postpathResultxpath = "_product_custom_more-info-button";

    public void clickonFirstResult() {

        WebElement moreInfo = $(By.id("iterator_1_product_custom_more-info-button"));
        BrowserUtils.waitForClickablility(moreInfo, 30);

        BrowserUtils.clickWithJS(moreInfo);
    }

    public void clickonResult(int i) {
        String xpath = prepathResultxpath + i + postpathResultxpath;
        WebElement moreInfo = getDriver().findElement(By.id(xpath));
        BrowserUtils.clickWithJS(moreInfo);
    }
}



