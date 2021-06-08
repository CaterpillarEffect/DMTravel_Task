package com.mailTravel.Utils;

import com.github.javafaker.Faker;

import java.util.Locale;

public class FakerData {
    Faker faker = new Faker(new Locale(("en-GB")));
    String firstname;
    String lastname;

    public void generatAName() {
        faker.name().firstName();
        String name = faker.harryPotter().character();
        String name1[] = name.split(" ");
        while(name1.length<=1){
            name = faker.harryPotter().character();
            name1 =name.split(" ");
        }

        firstname = name1[0];
        lastname = name1[1];


    }

    public String getAddress1(){
         String number = faker.address().buildingNumber();
         return number;

    }
    public String getAddress2(){
        String streetName = faker.address().streetName();
        return streetName;
    }
    public String getCity(){
        String city = faker.address().city();
        return city;
    }

    public String getFirstname() {
        return faker.name().firstName();

    }

    public String getLastname() {

        return faker.name().lastName();
    }
    public String getMobile(){

        return faker.phoneNumber().cellPhone();
    }

    public String getPostcode() {

        return faker.address().zipCode();
    }

    public String returnEmail() {

        return faker.internet().emailAddress();
    }
}
