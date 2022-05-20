Feature: Registration Test
  As user I want to register into Nop Commerce website

  Scenario: User should navigate to register page successfully
    Given I am on homepage
    When I click on registration link
    Then I verify "Register" text

  Scenario: User should get error message if mandatory fields not entered : enter first name, last name,email,password and confirm password
    Given I am on homepage
    When I click on registration link
    And I click on register button
    And I verify the error message "First name is required."
    And I Verify the last name error message "Last name is required."
    And I Verify the email error message "Email is required."
    And I Verify the password error message "Password is required."
    And I Verify the confirm password error message "Password is required."
    Then I can not register successfully

  Scenario: User should create account successfully
    Given  I am on homepage
    When I click on registration link
    And I select gender "Female"
    And I enter First Name "Geeta"
    And I enter Last name "Patel"
    And I enter email address "Geeta1945p@gmail.com"
    And I enter password to register "Geeta1945"
    And I enter confirm password "Geeta1945"
    And I click on register button
    Then I verify message "Your registration completed"




