package runCucumberTest;

import java.util.concurrent.TimeUnit;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/java/CucumberFeature"},
		glue = {"stepCucumber"}
		/*dryRun=true,
		monochrome=true,
		plugin= {"pretty", "html:test-output"}*/
				)

public class runTest {


}
