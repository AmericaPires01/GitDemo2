Feature: Application Login

  Scenario: Home Page default login Page
    Given User is on NetBanking landing Page
    When User Logs into the application with "username" and "password"
    Then Home Page is Displayed
    And Cards displayed "true"


  # Disabled User scenario
    And Cards displayed "false"

  # For disabled user scenario most of the steps are the same therefore we don't need to repeat them, we just reuse them and define only the different step on the disabled User scenario.
  # There should be one mapping implementation for each Gherkin line.
  # If business analyst is non technical he he will not know if a code step is missing, but if you give a feature file with a step missing he will be able to tell because the file shows error when a step is missing
  # Whatever test you are writing, Selenium, Appium, Rest API, DB testing you can use feature files and step definitions.
  # To highlight the gherkin language above press command and right click on the text

