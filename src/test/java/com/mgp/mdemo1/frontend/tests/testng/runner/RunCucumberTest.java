package com.mgp.mdemo1.frontend.tests.testng.runner;

import com.mgp.mdemo1.frontend.tests.common.MyListener;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Listeners;

@Listeners(MyListener.class)
@CucumberOptions(
        tags = "@SubmitAnInvalidApplication or @SubmitAnApplication",
        features = "classpath:features",
        glue = {"com.mgp.mdemo1.frontend.tests.common", "com.mgp.mdemo1.frontend.tests.stepdefinitions", "com.mgp.mdemo1.frontend.tests.testng.runner"},
        plugin = {"pretty", "json:target/cucumber-reports/cucumber.json", "html:target/cucumber-reports/cucumberreport.html"},
        monochrome = true
)

public class RunCucumberTest extends AbstractTestNGCucumberTests {
}
