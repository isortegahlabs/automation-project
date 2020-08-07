package me.isortegah.framework.testRunner;

import me.isortegah.framework.libs.CucumberRunner;
import me.isortegah.framework.libs.TestNGCucumberRunnerCustom;
import me.isortegah.framework.util.DateUtil;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.PickleEventWrapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.net.URISyntaxException;

@CucumberOptions(features = "src/test/resources/features",
        glue = "me.isortegah.framework.steps",
        plugin = {"pretty"})
public class TestRunnerRuntime {

    private TestNGCucumberRunnerCustom testNGCucumberRunner;

    private static final Logger logger = LogManager.getLogger();

    @BeforeClass(alwaysRun = true)
    public void setUpClass() throws Exception {
        testNGCucumberRunner = new TestNGCucumberRunnerCustom(this.getClass());
    }

    @Test
    public void sanityTest() throws InterruptedException {
        logger.info(DateUtil.getCurrentDate(this.getClass().getSimpleName() +":sanityTest"));
        Thread.sleep(5000L);

    }

    @Test
    public void feature() throws URISyntaxException {
        new CucumberRunner(this.getClass()).runCukes();
    }

    @Test(groups = "cucumber", description = "Runs Cucumber Feature", dataProvider = "features")
    public void feature(PickleEventWrapper pickleWrapper, CucumberFeatureWrapper featureWrapper) throws Throwable {
        testNGCucumberRunner.runScenario(pickleWrapper.getPickleEvent());
    }

    @DataProvider(parallel = true)
    public Object[][] features() {
        if (testNGCucumberRunner == null) {
            return new Object[0][0];
        }
        return testNGCucumberRunner.provideScenarios();
    }

    @AfterClass(alwaysRun = true)
    public void tearDownClass() throws Exception {
        if (testNGCucumberRunner == null) {
            return;
        }
        testNGCucumberRunner.finish();
    }


}