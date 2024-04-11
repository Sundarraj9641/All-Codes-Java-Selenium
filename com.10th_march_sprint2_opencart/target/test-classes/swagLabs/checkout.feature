@checkout
Feature: Validate checkout functionality of Swag Labs application

  Background:
    Given User is on Login Page of SwagLabs application
    When I enter the "UserName" as "standard_user" on Login Page of SwagLabs application
    When I enter the "Password" as "secret_sauce" on Login Page of SwagLabs application
    And I Click on the "Login" button on Login Page of SwagLabs application
    Then User should navigate to the Products page of SwagLabs application

  Scenario Outline: Adding a product to the Cart and complete checkout
    When I Select the product "<product>" on products page of SwagLabs application
    And I Click on the "Add to cart" button on products page of SwagLabs application
    And I Click on the "Shopping Cart" button on products page of SwagLabs application
    Then User should navigate to the Your Cart page of SwagLabs application
    Then I Verify the "<product>" get added in the cart on Your Cart page of SwagLabs application
    When I Click on the "Checkout" button on Your Cart page of SwagLabs application
    Then User should navigate to the Checkout: Your Information page of SwagLabs application
    When I Enter "First Name" as "<FirstName>" on Your Information page of SwagLabs application
    And I Enter "Last Name" as "<LastName>" on Your Information page of SwagLabs application
    And I Enter "Zipcode" as "<Zipcode>" on Your Information page of SwagLabs application
    Then User should navigate to the CHECKOUT: OVERVIEW page of SwagLabs application
    Then I Verify the "<product>" get displayed on overview page of SwagLabs application
    Then I Verify the Payment Details displayed on overview page of SwagLabs application
    Then I Verify the total amount to be paid on overview page of SwagLabs application
    When I Click on the "Finish" button on overview page of SwagLabs application
    Then User should navigate to the CHECKOUT: COMPLETE! page of SwagLabs application
    Then User should see the text "THANK YOU FOR YOUR ORDER" on complete page of SwagLabs application

    Examples:
      | product             | FirstName  | LastName  | Zipcode |
      | Sauce Labs Backpack | test first | test last | 61017   |
