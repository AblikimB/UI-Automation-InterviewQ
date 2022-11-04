package com.adidas.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/cucumber-report.html",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber"
        },
        features = "src/test/resources/adidas.feature" ,
        glue = "com/adidas/step_definitions" ,
        dryRun = false,
        tags = "@adidas1"
        //publish = true
)
public class CukesRunner {
}