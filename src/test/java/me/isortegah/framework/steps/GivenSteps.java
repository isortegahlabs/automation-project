package me.isortegah.framework.steps;

import com.google.inject.Inject;
import cucumber.api.java.en.Given;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class GivenSteps {

    private SharedData sharedData;
    private static final Logger logger = LogManager.getLogger();

    @Inject
    public GivenSteps(SharedData sharedData){
        this.sharedData = sharedData;
    }

    @Given("^today is (.*)$")
    public void today_is_Sunday(String day) {
        sharedData.today = day;
        logger.info("Given: Today --> " + sharedData.today);
    }

    @Given("^the URL base \"([^\"]*)\"$")
    public void urlBase(String urlBase) {
        sharedData.urlBase = urlBase;
        logger.info("URL base --> " + sharedData.urlBase);
    }
}
