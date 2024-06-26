
Feature: Verifying the smooth run of  saucedemo site

  Scenario: Verify the error message while logging in without any credentials
    Given  Navigate to the site of swag labs
    And click on the login button
    Then Verify the error message on the screen

  Scenario: Login with correct credentials
    Given  Navigate to the site of swag labs
    When Enter the correct username "standard_user" in the field of username
    And Enter the correct password "secret_sauce" in the field of password
    And click on the login button
    Then User must navigate to the inventory page

  Scenario: Adding items to the cart
    When Add sauce labs backpack to the  cart and store its price in an object
    Then Verify if remove button is visible for sauce labs backpack
    And  Add sauce labs fleece jacket to the  cart and store its price in an object
    Then Verify if remove button is visible for sauce labs fleece jacket
    Then Click on the shopping cart icon

  Scenario: Verify whether prices are same on the inventory and cart page
    When Check whether the price of sauce labs backpack is same or not
    And Check whether the price od sauce labs fleece jacket is same or not
    Then If both prices are same then click  on the checkout button

  Scenario: Fill out the details on the Checkout:Your Information page
    When Enter your first name
    And  Enter your last  name
    And  Enter the postal code of your address
    Then Click on the continue button

  Scenario: Verify total price and finish the checkout
    When Verify if you are on the final checkout screen
    And Verify item total
    And  Get the  value of tax
    And Verify the Grand total
    Then Click on the finish button
    And Verify if you are on the checkout complete page
    And Verify Thank you message
    Then Click om back home button
    Then Verify if you are on the inventory screen