package me.isortegah.framework.testRunner;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.DataProvider;


@CucumberOptions(features = "src/test/resources/features",
        glue = "me.isortegah.framework.steps",
        tags = "@current",
        plugin = {"pretty"})
public class TestRunnerAbstract extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }

}
