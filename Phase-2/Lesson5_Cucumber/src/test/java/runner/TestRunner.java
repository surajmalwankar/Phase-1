package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\suraj\\eclipse-workspace\\Lesson5_Cucumber\\src\\test\\java\\features\\TagsDemo.feature",
   				 glue= {"steps"},
				dryRun=true,
				plugin={"pretty",
						"html:target/cucumberreport.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
						"timeline:test-output-thread/"},
				

				tags="@all" // all the scenarios of feature file will be executed
			//	tags="@login" // only login will run
		     //   tags="@login and @logout"  // only scenarios having both the tags login and logout should run
		   //   tags = "@login or @logout"  
		    		// only scenarios having any of  the tags login or logout should run
		 //  tags = "not @logout" // avoid logout scenario and run the rest of the scenarios
		// tags = "@regression or @smoke or @functional" 
					//	 tags = "@regression"
				// all scenarios with tag regression will run
		
		
		)





public class TestRunner {

}
