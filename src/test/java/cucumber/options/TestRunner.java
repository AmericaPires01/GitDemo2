package cucumber.options;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions( features = "src/test/java" , glue = "step.definitions", strict = true) // for glue i only need to give the package name no need for the path as both step.definitions and cucumber.test.runner are inside the same directory (java)
 // By giving the features path up to the package this will run every feature files under the features package. However if need to run a specific feature file only give the path up to this specific feature file.
public class TestRunner { // glue is a parameter to define StepDefinition classes, all we have to do is to only define the step.definition package name as glue parameter in order for every class inside this step.definition package to run. No need to give the path for step.definitions package.
    //todo Always make sure that Step Definitions classes package, feature files package and TestRunner class package are all under the same folder (java directory), otherwise cucumber-Junit will not be ble to identify the step definitions and throw error io.cucumber.junit.UndefinedStepException.
    //todo All my packages were under another package that's why I previously got error.

    // I have to pass feature file parameter and Step definition here in the Test Runner.
    // Whenever file i provide here in Test Runner it will go and search for it and trigger that feature file execution.
    // and when the feature file is looking for its mapping step definition file I make sure I have also defined the Step Definition here in Test Runner so the Test Runner will give the exact location of Step definition to the feature file when it loos for it.
    // in order for Feature file to comfortably identify the step definition from the input of what Test Runner gives to then go inside the step definition and start the execution.



}
