package com.mailTravel.TestRunner;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = "com/mailTravel/StepDefinitions",
        features = "src/test/resources/features",
        dryRun = false,
        tags = "@mailTravel"
)
public class CukesRunner {


}
