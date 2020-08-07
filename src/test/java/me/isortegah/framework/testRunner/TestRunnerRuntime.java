package me.isortegah.framework.testRunner;

import me.isortegah.framework.libs.TestNGCucumberRunnerCustom;
import me.isortegah.framework.util.DateUtil;
import io.cucumber.testng.CucumberOptions;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@CucumberOptions(features = "src/test/resources/features",
        glue = "me.isortegah.framework.steps",
        plugin = {"pretty"})
public class TestRunnerRuntime {
/*
    private TestNGCucumberRunnerCustom testNGCucumberRunner;

    private static final Logger logger = LogManager.getLogger();

    @BeforeClass(alwaysRun = true)
    public void setUpClass() throws Exception {
        //testNGCucumberRunner = new TestNGCucumberRunnerCustom(this.getClass());
    }

    @Test
    public void sanityTest() throws InterruptedException {
        logger.info(DateUtil.getCurrentDate(this.getClass().getSimpleName() +":sanityTest"));
        Thread.sleep(5000L);

    }

    /*@Test(groups = "cucumber", description = "Runs Cucumber Feature", dataProvider = "features")
    public void feature(PickleWrapper pickleWrapper, FeatureWrapper featureWrapper) throws Throwable {
        testNGCucumberRunner.runScenario(pickleWrapper.getPickle());
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
*/

}