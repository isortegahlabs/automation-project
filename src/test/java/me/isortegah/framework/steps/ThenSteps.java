package me.isortegah.framework.steps;

import com.google.inject.Inject;
import cucumber.api.java.en.Then;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

public class ThenSteps {

    private SharedData sharedData;
    private static final Logger logger = LogManager.getLogger();

    @Inject
    public ThenSteps(SharedData sharedData){
        this.sharedData = sharedData;
    }

    @Then("^I should be told \"([^\"]*)\"$")
    public void i_should_be_told(String expectedAnswer) {
        Assert.assertEquals(expectedAnswer, sharedData.actualAnswer);
    }
}
