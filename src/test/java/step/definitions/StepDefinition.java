package step.definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

// For Selenium test, we can invoke the browser here in this class.
//todo Always make sure that Step Definitions classes package, feature files package and TestRunner class package are all under the same folder (java directory), otherwise cucumber-Junit will not be ble to identify the step definitions and throw error io.cucumber.junit.UndefinedStepException. All my packages were under another package that's why I previously got error.
public class StepDefinition { // When using Tidy Gherkin plug (Tg) in Chrome browser to generate step definitions from feature file given, this generates the step definitions class.

    //todo   This is the steps generated from Tidy Gherkin
    @Given("^User is on NetBanking landing Page$")  // step definition file should match with tag name and description
        public void user_is_on_netbanking_landing_page() throws Throwable {
            System.out.println("Code to assert Landing Page is present");
        }

        @When("^User Logs into the application with \"([^\"]*)\" and \"([^\"]*)\"$") //Regular expressions are the key to Cucumber's flexibility. Well-crafted regular expressions let you reuse step definitions, avoiding duplication and keeping your tests maintainable
        public void user_logs_into_the_application_with_username_and_password(String username, String password) {
            System.out.println("Code to validate user logging in with " + username + "," + password);
        }

        @Then("^Home Page is Displayed$")
        public void home_page_is_displayed() throws Throwable {
            System.out.println("Code to validate Home Page is displayed");
        }

        @And("Cards displayed {string}")
        public void cardsDisplayed(String cards) {
            System.out.println("Code to validate cards are displayed--> " + cards);
        }



    /*
    @When("User Logs into the application with {string} and {string}") todo String step generated from IntelliJ
    public void userLogsIntoTheApplicationWithAnd(String arg0, String arg1) {
    } */

    // todo  TBV further I believe if i have different feature files lets say, login.feature, home.feature..., and different StepDefinition class i can do this like EndToEnd Framework where each feature file belongs to its own StepDefinition class.





   // todo   This is the steps generated from IntelliJ
/*  @Given("User is on NetBanking landing Page")
    public void userIsOnNetBankingLandingPage() throws Throwable{
    System.out.println("Code to assert Landing Page is present");
    }

    @When("User Logs into the application with Username and Password")
    public void userLogsIntoTheApplicationWithUsernameAndPassword() {
    System.out.println("Code to validate user is logged in");
    }

    @Then("Home Page is Displayed")
    public void homePageIsDisplayed() {
    System.out.println("Code to validate Home Page is displayed");
    }

    @And("Cards are displayed")
    public void cardsAreDisplayed() {
    System.out.println("Code to validate cards are displayed");
    } */

    //todo I can also get step definitions by running this class with no step on it, it will fail saying that step is undefined and give me the steps as shown below and i can just copy and paste it here in this class.
    /* io.cucumber.junit.UndefinedStepException: The step "User is on NetBanking landing Page" is undefined. You can implement it using the snippet(s) below:
    @Given("User is on NetBanking landing Page")
    public void user_is_on_net_banking_landing_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    //Some other steps were also undefined:
    @When("User Logs into the application with Username and Password")
    public void user_logs_into_the_application_with_username_and_password() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Home Page is Displayed")
    public void home_page_is_displayed() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Cards are displayed")
    public void cards_are_displayed() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    } */

}
