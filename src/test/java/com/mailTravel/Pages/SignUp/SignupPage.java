package com.mailTravel.Pages.SignUp;


import com.mailTravel.Utils.FakerData;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignupPage extends PageObject {
    @FindBy( id = "agree" )
    public WebElement acceptTerms;

    @FindBy( id = "sign-up" )
    public WebElement signupbtn;

    @FindBy( xpath = "//*[@placeholder ='First Name']" )
    public WebElement firstName;

    @FindBy( xpath = "//*[@placeholder ='Last Name']" )
    public WebElement lastName;

    @FindBy( name = "email" )
    public WebElement email;

    @FindBy( xpath = "//*[@placeholder ='Postcode']" )
    public WebElement Postcode;

    FakerData faker = new FakerData();

    public void enterLastname() {
        lastName.sendKeys(faker.getLastname());

    }

    public void enterFirstname() {
        firstName.sendKeys(faker.getFirstname());

    }

    public void enterEmailname() {
        email.sendKeys(faker.returnEmail());

    }

    public void enterPostcode() {
        Postcode.sendKeys(faker.getPostcode());

    }

    public void acceptTermsandConditions() {

        acceptTerms.click();
    }

    public void enterInformation() {
        acceptTermsandConditions();
        enterFirstname();
        enterLastname();
        enterPostcode();
        enterEmailname();
        signupbtn.click();

    }


}
