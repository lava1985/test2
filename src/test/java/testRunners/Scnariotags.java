package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="./src/test/resources/featureFile/Feature1.feature",
                 tags="(@smoke and @sanity)")
public class Scnariotags {

}
