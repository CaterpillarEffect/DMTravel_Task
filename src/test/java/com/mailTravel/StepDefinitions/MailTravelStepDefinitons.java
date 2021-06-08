package com.mailTravel.StepDefinitions;

import com.mailTravel.Steps.MailTravelSteps;
import io.cucumber.java.en.*;
import net.thucydides.core.annotations.Steps;

import java.util.List;
import java.util.Map;

public class MailTravelStepDefinitons {

    @Steps
    MailTravelSteps mailTravelSteps;

    @Given( "user is on the homepage" )
    public void user_is_on_the_homepage() {
        mailTravelSteps.openPage();
    }

    @Given( "user verifies Homepage Title" )
    public void user_verifies_homepage_title() {
        mailTravelSteps.userverfiesPageTitle();

    }

    @Given( "user searches {string}" )
    public void user_searches(String string) {
        mailTravelSteps.userseachesforDestination(string);
    }

    @Given( "user clicks More Info button of result {int}" )
    public void user_clicks_more_info_button_of_result(Integer int1) {

        mailTravelSteps.userClicksonResult(int1);

    }


    @Then( "user checks that the following information is displayed:" )
    public void user_checks_that_the_following_information_is_displayed(Map<String, String> dataTable) {
        mailTravelSteps.userChecksinformation(dataTable);
    }

    @Then( "{string} is displayed" )
    public void is_displayed(String string) {
        mailTravelSteps.userchecksInfoDisplayed(string);
    }

    @When( "user clicks on Itinerary" )
    public void user_clicks_on_itinerary() {
        mailTravelSteps.userClicksonIternary();

    }

    @Then( "verifies all days of Itinerary display Information" )
    public void verifies_all_days_of_itinerary_display_information() {
        mailTravelSteps.userVerfiesAlldaysIternarycontainInformation();
    }

    @When( "user clicks on {string} button" )
    public void user_clicks_on_button(String string) {

        mailTravelSteps.userClicksonBtn(string);

    }

    @Then( "user verifies the default date is selected" )
    public void user_verifies_the_default_date_is_selected() {
        mailTravelSteps.verfiyDateSelected();

    }

    @Then( "user verifies that selected date is set as departure date and departure date+9 as the last date." )
    public void user_verifies_that_selected_date_is_set_as_departure_date_and_departure_date_as_the_last_date() {
        mailTravelSteps.checkdeparture();
        mailTravelSteps.checkreturn();
    }

    @When( "user clicks on {string} link" )
    public void user_clicks_on_link(String string) {
        mailTravelSteps.clickslink();
    }

    @When( "user enters the given data for standard room;" )
    public void user_enters_the_given_data_for_standard_room(List<String> dataTable) {
        mailTravelSteps.selectRooms(dataTable);

    }

    @When( "user clicks on {string}" )
    public void user_clicks_on(String string) {
        mailTravelSteps.clickContinue(string);
    }

    @When( "user selects default value in Extras" )
    public void user_selects_default_value_in_extras() {

    }

    @When( "user fills out dummy information in the Passenger Details" )
    public void user_fills_out_dummy_information_in_the_passenger_details() {
        mailTravelSteps.entersPassengerDetails();

    }

    @Then( "user verifies that it is proceeding to payment page" )
    public void user_verifies_that_it_is_proceeding_to_payment_page() {
        mailTravelSteps.userVerifiesHeisDirectedtoPaymentPage();

    }


}
