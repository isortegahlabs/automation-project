package me.isortegah.framework.steps;

import com.google.inject.Inject;
import io.cucumber.java.en.When;
import me.isortegah.framework.util.IsItFriday;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class WhenSteps {

    private SharedData sharedData;
    private static final Logger logger = LogManager.getLogger();

    @Inject
    public WhenSteps(SharedData sharedData){
        this.sharedData = sharedData;
    }

    @When("^I ask whether it's Friday yet$")
    public void i_ask_whether_it_s_Friday_yet() throws InterruptedException {
        this.sharedData.actualAnswer = IsItFriday.isIt(sharedData.today);
    }
}
