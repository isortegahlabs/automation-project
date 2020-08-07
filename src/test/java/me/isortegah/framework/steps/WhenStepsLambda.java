package me.isortegah.framework.steps;

import com.google.inject.Inject;
import io.cucumber.java8.En;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class WhenStepsLambda implements En {

    private SharedData sharedData;
    private static final Logger logger = LogManager.getLogger();

    @Inject
    public WhenStepsLambda(SharedData sharedData){
        this.sharedData = sharedData;
        WhenStepsLambdaSteps();
    }

    private void WhenStepsLambdaSteps() {

        When("^the \"(local|remote)\" browser is open$",(String browserType)->{
            sharedData.setBrowserDriver();
            sharedData.getBrowserDriver().open(sharedData.urlBase);
        });

        When("^the browser is closed$", () -> sharedData.getBrowserDriver().close());
    }

}
