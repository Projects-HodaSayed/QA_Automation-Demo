@test
Feature: F_Login | users could use login functionality to use their accounts
  Scenario: user could login with valid user and password
    When user go to login page
    When user login with User "bob@example.com" and "10203040"
    And user press on login button
    Then user login to the system successfully
    Then Logout

  Scenario: user could login with locked user and password
    When user login with User "alice@example.com" and "10203040"
    And  user press on login button
    Then Error returned to user "Locked"

  Scenario: user could login with NotMatched user and password
    When user login with User "1@2.com" and "f-o-o"
    And  user press on login button
    Then Error returned to user "NotMatched"

  Scenario: user could login with Empty user and password
    When user login with User "" and ""
    And  user press on login button
    Then Error returned to user "EmptyUser"

  Scenario: user could login with user and Empty password
    When user login with User "bob@example.com" and ""
    And  user press on login button
    Then Error returned to user "EmptyPass"
