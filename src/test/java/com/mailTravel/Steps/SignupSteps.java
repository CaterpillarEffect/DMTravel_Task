package com.mailTravel.Steps;


import com.mailTravel.Pages.MailTravelPage;
import com.mailTravel.Pages.SignUp.SignupConfirmationPage;
import com.mailTravel.Pages.SignUp.SignupPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class SignupSteps {
    MailTravelPage mailTravelPage = new MailTravelPage();
    SignupPage signup = new SignupPage();
    SignupConfirmationPage confirmationPage = new SignupConfirmationPage();

    @Step( "user clicks on subscribe button" )
    public void user_clicks_on_subscribe_button() {
        mailTravelPage.clickSignup();

    }

    @Step( "user signs up with dummy user information" )
    public void user_signs_up_with_dummy_user_information() {
        signup.enterInformation();

    }

    @Step( "user verifies that he is on confirmation page" )
    public void user_verifies_that_he_is_on_confirmation_page() {
        Assert.assertTrue(confirmationPage.confirm());

    }
}
