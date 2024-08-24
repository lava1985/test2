package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features={"./src/test/resources/featureFile/Feature1.feature",
		                  "./src/test/resources/featureFile/Feature2.feature",
		                  "./src/test/resources/featureFile/Feature3.feature",
		                  "./src/test/resources/featureFile/Feature4.feature",},
                 tags="((@smoke or @sanity) and not @regresion) and (@System or @UAT)")
public class FeatureTagsTest {

}
