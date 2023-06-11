package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features= {".//Feature//demo.feature"},
		glue="StepDef",
plugin= {

"pretty", "html:reports/myreport.html",

"json:reports/myreport.json",

"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"

},
dryRun=false,
monochrome=true
		)

public class testRunner{
	
}
