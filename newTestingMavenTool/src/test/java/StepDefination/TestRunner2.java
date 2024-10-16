package StepDefination;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/featureFile/signup2.feature", glue="StepDefination",
monochrome=true,
tags="@single or @multiple",
plugin= {"html:src/test/resources/target/reports3.html"})

public class TestRunner2 {

}
