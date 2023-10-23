package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\suraj\\eclipse-workspace\\Lesson5_Cucumber\\src\\main\\java\\features\\DataTableDemo.feature",
				 glue= {"steps"},
				 plugin= {"html:target/Cucumberreport.html",
						 "pretty",
						"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
						"timeline:test-output-thread/"		
				},tags = "@register" // Now give the tag @register, you will observe before and after hook is executed
				 
		)

public class TestRunner1 {

}
