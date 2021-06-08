package com.mailTravel.StepDefinitions;

import com.mailTravel.Steps.SignupSteps;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class SignUpStepDefinitions {
    @Steps
    SignupSteps signup;

    @Then( "user clicks on subscribe button" )
    public void user_clicks_on_subscribe_button() {

        signup.user_clicks_on_subscribe_button();
    }

    @Then( "user signs up with dummy user information" )
    public void user_signs_up_with_dummy_user_information() {
        signup.user_signs_up_with_dummy_user_information();
    }

    @Then( "user verifies that he is on confirmation page" )
    public void user_verifies_that_he_is_on_confirmation_page() {
        signup.user_verifies_that_he_is_on_confirmation_page();
    }
}
