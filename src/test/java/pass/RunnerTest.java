package pass;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features")
@RunWith(Cucumber.class)
public class RunnerTest {
}
