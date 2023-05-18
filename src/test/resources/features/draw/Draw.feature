Feature: Login
  As a user if I try to sign-in with valid credential,
  I should navigate to home screen. If I try to sign-in with invalid credential,
  app will displays error message.

  Background:
    Given User navigates to login page

  @draw
  Scenario: Draw
    And User selects menu
    When User select Drawing menu
    Then User should be navigate to Drawing page

