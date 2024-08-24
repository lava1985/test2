package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/featureFile/Skilllary_Login.feature",
                 glue="stepDefinition",
                 plugin= {"pretty",
                		 "html:target/HTML/report.html",
                		 "json:target/JSON/report.json",
                		 "junit:target/JUNIT/report.xml"})//plugin for reports
public class TestRunners {

}