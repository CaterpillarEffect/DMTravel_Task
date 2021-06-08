package com.mailTravel.TestRunner;

import io.cucumber.java.After;

import java.io.IOException;

import static net.serenitybdd.core.Serenity.getDriver;

public class Hook {
    @After
    public void tidyUp() throws IOException {
        getDriver().manage().deleteAllCookies();
      		Runtime.getRuntime().exec("cmd.exe /c mvn serenity:aggregate");
    }
}
