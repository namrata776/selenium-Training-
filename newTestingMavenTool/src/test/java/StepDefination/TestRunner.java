package StepDefination;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/featureFile/signup.feature", glue="StepDefination",
monochrome=true,
plugin= {"html:src/test/resources/target/reports2.html"})
public class TestRunner {

}
