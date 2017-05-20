package SauceLabAgileBDD;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by Gamita on 19/05/2017.
 */


 @RunWith(Cucumber.class)
 @CucumberOptions(features = ".",
                  format = {"html:target/CucumberReport","json:CucumberReport/cucumber.json"},
                  tags = "@search",
                  glue = "SauceLabAgileBDD")

    public class RunTest {
}
