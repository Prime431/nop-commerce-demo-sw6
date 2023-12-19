
Feature: Login Feature
  @author_vishal  @smoke @regression
  Scenario: userShouldNavigateToLoginPageSuccessFully
    Given I am on homepage
    When I click on login link
    Then I should verify that "Welcome, Please Sign In!" message display

  @author_vishal @regression
  Scenario: verifyThatUserShouldLogInSuccessFullyWithValidCredentials
    Given I am on homepage
    When I click on login link
    And Enter EmailId "primefivetest@gmail.com"
    And Enter Password "Password123"
    Then Click on Login Button
    And Verify that LogOut link is display
  @sanity
  Scenario: VerifyThatUserShouldLogOutSuccessFully
    Given I am on homepage
    When I click on login link
    And Enter EmailId "primefivetest@gmail.com"
    And Enter Password "Password123"
    And Click on Login Button
    Then Click on LogOut Link
    And Verify that LogIn Link Display

  @regression
  Scenario Outline: verifyTheErrorMessageWithInValidCredentials
    Given I am on homepage
    When I click on login link
    And Enter EmailId "<email>"
    And Enter Password "<password>"
    Then Click on Login Button
    And Verify that the Error message "<errorMessage>"

    Examples:
      | email              | password | errorMessage                                                                                |
      | abcd123@gmail.com  | xyz123   | Login was unsuccessful. Please correct the errors and try again.\nNo customer account found |
      | xyz123@gmail.com   | abc123   | Login was unsuccessful. Please correct the errors and try again.\nNo customer account found |
      | adfafasd@gmail.com | xyz123   | Login was unsuccessful. Please correct the errors and try again.\nNo customer account found |
