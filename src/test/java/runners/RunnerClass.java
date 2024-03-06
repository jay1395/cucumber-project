package runners;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@io.cucumber.junit.CucumberOptions(
		features = "C:\\QA\\Selenium_WorkSpace\\CucumberProjectBatch77\\src\\test\\java\\features",//the path of the feature files
		glue={"stepdefinations"},
		
				plugin= {"pretty","html:target/cucumber-reports","json: json-output/cucumber.json","junit: junit-xml/cucumber.xml"},
				dryRun = false,
				monochrome =true
		)//step Defination Package Name
		
public class RunnerClass {

}
