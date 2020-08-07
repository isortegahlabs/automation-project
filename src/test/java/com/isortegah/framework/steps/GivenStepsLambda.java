package com.isortegah.framework.steps;

import com.google.inject.Inject;
import cucumber.api.Scenario;
import cucumber.api.java8.En;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class GivenStepsLambda implements En {

    private SharedData sharedData;
    private static final Logger logger = LogManager.getLogger();

    //Lambda-steps inside Constructors opcion mas usada
    @Inject
    public GivenStepsLambda(SharedData sharedData) {
        this.sharedData = sharedData;

        GivenStepsLambdaSteps();

        Given("^the domain \"([^\"]*)\"$", (String urlbase) -> this.sharedData.urlBase = urlbase);


    }

    //Lambda-steps inside method
    private void GivenStepsLambdaSteps() {
        Before((Scenario scenario) -> {
            logger.info("Before scenario : " + scenario.getName() + "Started in thread: " + sharedData.threadId + ", in JVM: " + sharedData.processName);
        });

        After((Scenario scenario) -> {
            logger.info("After scenario : " + scenario.getName() + " in thread: " + sharedData.threadId);
        });

        Given("^A connection \"([^\"]*)\"$", (String urlBase) -> {
            this.sharedData.urlBase = urlBase;
            logger.info("URL base --> " + sharedData.urlBase);
        });

        Given("^the browser \"(chrome|firefox)\"$", (String browser) -> sharedData.setBrowser(browser));

    }
}