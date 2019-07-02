Feature: Test search functionality on google.com

  Scenario: Test search
    Given I open the Google page
    And I enter the "football" keyword
    And I press "Google Search" button
    Then the results page is displayed