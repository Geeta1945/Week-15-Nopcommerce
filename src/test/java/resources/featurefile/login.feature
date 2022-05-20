Feature: Login Test
  As user I want to login into nopCommerce website

  Scenario: User Should navigate login page successfully
    Given I am on homepage
    When I click on login link
    Then I should navigate to login page successfully

  Scenario: User should get error message with invalid credentials
    Given I am on homepage
    When I click on login link
    And I enter email "abcdmyemail@yahoo.com"
    And I enter password "abc123"
    And I click on login button
    Then I verify the error message

  Scenario: User should log in successfully with valid credentials
    Given I am on homepage
    When I click on login link
    And  I enter email "patelharit71@yahoo.com"
    And I enter password "patelharit71"
    And I click on login button
    Then I verify logout link is displayed

  Scenario: User should log out successfully
    Given I am on homepage
    When I click on login link
    And  I enter email "patelharit71@yahoo.com"
    And I enter password "patelharit71"
    And I click on login button
    And I click on log out button
    Then I verify login link displayed





