Feature: Test Search Feature

  Scenario: Search Page Test
    Given I am on Search Page
    And I enter the search text
    Then I click on submit
    Then I verify the search results
