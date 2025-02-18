package org.TestRunner;


import java.io.IOException;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.utilities.JvmReport;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources", glue="org.StepDefinition", monochrome=true, 
dryRun=false, tags="@Sanity", plugin= {"html:target\\Reports", "junit:target\\Reports\\fb.xml",
		"json:target\\Reports\\facebook.json", "rerun:\\src\\test\\resources\\Rerun\\Failed.txt"})



public class TestRunnerClass {
	@AfterClass
	
	public static void fullReport() throws IOException {
		JvmReport.generateJvmReport(System.getProperty("user.dir")+"\\target\\Reports\\facebook.json");


	}
	
	

}
