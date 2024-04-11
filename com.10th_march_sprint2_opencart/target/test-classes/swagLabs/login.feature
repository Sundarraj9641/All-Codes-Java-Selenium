@Login
Feature: Validate Login functionality of Swag Labs application


  Scenario Outline: Login into SwagLabs application
    Given User is on Login Page of SwagLabs application
    When I enter the "UserName" as "<username>" on Login Page of SwagLabs application
    When I enter the "Password" as "<password>" on Login Page of SwagLabs application
    And I Click on the "Login" button on Login Page of SwagLabs application
    Then User should navigate to the Products page of SwagLabs application

    #Examples:
     # | username      | password     |
      #| standard_user | secret_sauce |
 Examples:
      | username      | password     |
      | pravinsingh918@gmail.com | singh |
   # Scenario: Validate input fields with Valid inputs
    #Scenario: Validate input fields with Invalid inputs

