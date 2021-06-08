package com.mailTravel.Steps;

import com.mailTravel.Pages.BookPackage.*;
import com.mailTravel.Pages.MailTravelPage;
import com.mailTravel.Pages.ResultsPage;
import com.mailTravel.Utils.BrowserUtils;
import com.mailTravel.Utils.FakerData;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.core.Serenity.getDriver;

public class MailTravelSteps {

    MailTravelPage mailTravelPage;
    ResultsPage resultsPage;
    InformationPage informationPage;
    BookingInformationPage bookingInformationPage;
    TransportPage transportPage;
    AccommodationPage accommodationPage;
    PassengerDetailsPage passengerDetails;
    String depatureDate;
    FakerData faker;
    PaymentDetailsPage payment;


    @Step( "user is on the page" )
    public void openPage() {
        mailTravelPage.open();
        cancelCookies();
    }


    @Step( "user cancels cookies" )
    public void cancelCookies() {
        mailTravelPage.closeCookies();
    }

    @Step( "user verfies pagetitle" )
    public void userverfiesPageTitle() {
        String title = getDriver().getTitle();
        Assert.assertEquals("Home Page | Mail Travel", title);


    }

    @Step( "user searches for destination" )
    public void userseachesforDestination(String search) {
        mailTravelPage.enterSearchTerm(search);
    }

    @Step( "user clicks on result" )
    public void userClicksonResult(int i) {
        BrowserUtils.waitFor(3);
        resultsPage.clickonResult(i);
        // cancelCookies();


    }

    @Step( "user checks that information is displayed" )
    public void userChecksinformation(Map<String, String> dataTable) {
        for (String s : dataTable.keySet()) {
            WebElement e = informationPage.getWebelement(s);
            String text = e.getText();
            String expected = dataTable.get(s);
            Assert.assertEquals(expected, text);
            Assert.assertTrue(e.isDisplayed());
        }
    }

    @Step( "user checks that information is displayed" )
    public void userchecksInfoDisplayed(String s) {
        WebElement e = informationPage.getWebelement(s);
        String text = e.getText();

        Assert.assertTrue(e.isDisplayed());


    }

    @Step( "user clicks on Iternary" )
    public void userClicksonIternary() {
        informationPage.Itinerary_link.click();
    }

    @Step( "user verifies that all days of Iternary contain Information" )
    public void userVerfiesAlldaysIternarycontainInformation() {
        informationPage.IternarycontainsText();
    }

    @Step( "user clicks on Button" )
    public void userClicksonBtn(String s) {
        informationPage.clickBtn(s);
    }

    @Step( "user verifies that the default date is selected" )
    public void verfiyDateSelected() {
        depatureDate = bookingInformationPage.DepatureDate();
        Assert.assertTrue(bookingInformationPage.Dateselected().isSelected());

    }

    @Step( "user clicks on Transport Link" )

    public void clickslink() {
        informationPage.Transportbtnclick();
    }

    @Step( "user checks depature Date" )
    public void checkdeparture() {
        String expected1 = transportPage.getTextDepatureDate();
        String[] arr = expected1.split(" ");
        String expected = arr[1] + " " + arr[2] + " " + arr[3];

        Assert.assertEquals(depatureDate, expected);

    }

    @Step( " user checks return Date" )
    public void checkreturn() {
        String expected = transportPage.getTextReturnDate();
        Assert.assertEquals(transportPage.expectedReturndate(), expected);
    }

    @Step( "user selects Rooms" )
    public void selectRooms(List<String> options) {
        for (String option : options) {
            accommodationPage.selectStandardRoom(option);

        }
    }

    @Step( "user clicks Continue" )
    public void clickContinue(String s) {
        accommodationPage.clickBtn(s);

    }

    @Step( "user enters Passenger Details" )
    public void entersPassengerDetails() {
        BrowserUtils.waitFor(2);
        FakerData faker = new FakerData();
        String leadfirstname = faker.getFirstname();
        String leadlastname = faker.getLastname();
        String leadname = leadfirstname + " " + leadlastname;
        passengerDetails.selectTitleLeadPax("Mr", passengerDetails.titlePass1);
        passengerDetails.enterText(passengerDetails.pax1FirstName, leadfirstname);
        passengerDetails.enterText(passengerDetails.pax1LastName, leadlastname);
        passengerDetails.selectTitleLeadPax("1", passengerDetails.pax1Dobd);
        passengerDetails.selectTitleLeadPax(passengerDetails.pax1Dobm);
        passengerDetails.selectTitleLeadPax("2000", passengerDetails.pax1Doby);
        passengerDetails.selectTitleLeadPax("Mr", passengerDetails.titlePass2);
        passengerDetails.enterText(passengerDetails.pax2FirstName, faker.getFirstname());
        passengerDetails.enterText(passengerDetails.pax2LastName, faker.getLastname());
        passengerDetails.selectTitleLeadPax("1", passengerDetails.pax2Dobd);
        passengerDetails.selectTitleLeadPax(passengerDetails.pax2Dobm);
        passengerDetails.selectTitleLeadPax("2000", passengerDetails.pax2Doby);
        //passengerDetails.enterText(passengerDetails.contactName,leadname);
        passengerDetails.enterText(passengerDetails.contactMobile, faker.getMobile());
        passengerDetails.enterText(passengerDetails.contactEmail, faker.returnEmail());
        passengerDetails.enterText(passengerDetails.contactAddress1, faker.getAddress1());
        passengerDetails.enterText(passengerDetails.contactAddress1, faker.getAddress2());
        passengerDetails.enterText(passengerDetails.contactCity, faker.getCity());
        passengerDetails.enterText(passengerDetails.postCode, faker.getPostcode());
        passengerDetails.continueBtn.click();


    }

    @Step( "user goes to payment page" )
    public void userVerifiesHeisDirectedtoPaymentPage() {
        BrowserUtils.waitFor(6);
        String actual = payment.paymentHeader.getText();
        Assert.assertEquals(actual, "Payment Details");
    }
}

