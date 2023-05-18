Feature: Login
  As a user if I try to sign-in with valid credential,
  I should navigate to home screen. If I try to sign-in with invalid credential,
  app will displays error message.

  Background:
    Given User navigates to login page

  @login @validCredential
  Scenario: Sign-in sauceLab app with valid credential
    And User enters valid user name
    And User enters valid password
    When User clicks Login button
    Then User should be navigate to home screen

