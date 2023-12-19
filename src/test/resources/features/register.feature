
Feature: Register

  @Author_Vishal

  Scenario: Verify User Should Navigate To Register Page Successfully
    Given I am on homepage
    When I Click on Register Link
    Then I Verify Register text
  @regression
  Scenario: Verify That First Name Last Name Email Password And ConfirmPasswordFields Are Mandatory
    Given I am on homepage
    When I Click on Register Link
    Then I Click on REGISTER button
    And I Verify the error message First name is required.
    And I Verify the error message Last name is required.
    And I Verify the error message Email is required.
    And I Verify the error message Password is required.
    And I Verify the error message for Confirm Password is required.
  @regression
  Scenario: Verify That User Should Create Account Successfully
    Given I am on homepage
    When I Click on Register Link
    And I Select gender "Female"
    And I Enter firstname
    And I Enter lastname
    And I Select day
    And I Select month
    And I Select year
    And I Enter email
    And I Enter password
    And I Enter Confirm Password
    Then I Click on REGISTER button
    And I Verify message "Your registration completed"