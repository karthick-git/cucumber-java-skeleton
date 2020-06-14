package io.cucumber.shouty;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(  monochrome = true,
        features = "src/test/resources/io/cucumber/shouty",
        plugin = { "pretty","html: cucumber-html-reports",
                "json: cucumber-html-reports/cucumber.json" },
        dryRun = false,
        glue = "src/test/java/io/cucumber/skeleton/stepDefinitions"
        )
public class RunCucumberTest {
}


