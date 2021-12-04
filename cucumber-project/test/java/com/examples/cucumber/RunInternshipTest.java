package com.examples.cucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"classpath:features/Internship.feature"},
        glue = {"com.examples.cucumber"})
public class RunInternshipTest {
}
