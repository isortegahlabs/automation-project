import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"},features = {"classpath:features/is_it_friday_yet2.feature"})
public class RunCucumberTest2 {


}