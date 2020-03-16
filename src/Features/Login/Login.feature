Feature: It contains login testcases

  @login
  Scenario: Login to newtours
    Given I open the browser "chrome"
    When I enter username "1"
    And I enter password ""
    And I click on submit button
    Then I validate user homepage title