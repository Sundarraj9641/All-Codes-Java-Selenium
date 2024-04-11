@Products_SwagLabs
Feature: Validate products page functionality of Swag Labs application

  Background:
    Given User is on Login Page of SwagLabs application
    When I enter the "UserName" as "standard_user" on Login Page of SwagLabs application
    When I enter the "Password" as "secret_sauce" on Login Page of SwagLabs application
    And I Click on the "Login" button on Login Page of SwagLabs application
    Then User should navigate to the Products page of SwagLabs application

  Scenario Outline: Adding a product to the Cart
    When I Select the product "<product>" on products page of SwagLabs application
    And I Click on the "Add to cart" button on products page of SwagLabs application
    And I Click on the "Shopping Cart" button on products page of SwagLabs application
    Then User should navigate to the Your Cart page of SwagLabs application
    Then I Verify the "<product>" get added in the cart on Your Cart page of SwagLabs application

    Examples:
      | product             |
      | Sauce Labs Backpack |

    #Scenario: Validating defaults elements on products page
    #Scenario: Validating Filter options of products page
