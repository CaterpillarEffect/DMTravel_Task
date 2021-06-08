package com.mailTravel.Pages.BookPackage;

import com.mailTravel.Utils.CalendarUtils;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Date;

public class TransportPage extends PageObject {
    @FindBy( xpath = "//*[@id='transport-0-departure']/td[3]" )
    public WebElement DepartureDate;
    @FindBy( xpath = "(//*[@id='transport-0-departure'])[2]/td[3]" )
    public WebElement ReturnDate;
    CalendarUtils calendar = new CalendarUtils();

    public String getTextDepatureDate() {
        String s = DepartureDate.getText();
        return s;
    }

    public String getTextReturnDate() {
        String s = ReturnDate.getText();
        return s;
    }

    public String expectedReturndate() {
        String s = getTextDepatureDate();
        Date depart = calendar.confirmDateCal(getTextDepatureDate());
        String departure = calendar.calculateDate("9", depart);
        departure = departure.replace("/", " ");
        return departure;
    }


}
