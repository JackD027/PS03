Feature: Test Login Feature
 
  Scenario: Login Page Test
    Given I am on Login Page
    And I give the email and password
    When I click submit
    And I am logged in as admin


  