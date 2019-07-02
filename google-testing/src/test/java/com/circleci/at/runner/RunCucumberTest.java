package com.circleci.at.runner;



import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features/"}
        , glue = {"com.circleci.at.steps"}
        //, tags = {"@regression", "~@wip"}
        , plugin = {"html:target/cucumber-report", "json:target/cucumber.json"}
)
public class RunCucumberTest {

}
