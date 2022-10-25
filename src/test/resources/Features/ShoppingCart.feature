Feature: check shopping cart functionality

  Background: user is logged in
    Given Open webb url "https://www.saucedemo.com/"
    And input usernamee "standard_user" and password "secret_sauce"
    When click loginn button
    Then Should sucess login and redirect to homepage

  Scenario: add product to shopping cart and chekout
    When user select and click product
    And click shopping cart logo
    And click checkout
    And input FirstName,LastName,and Zip/Postal Code
    And click continue
    And click finish
    Then show checkout: complete

  Scenario: check add products to shopping cart and remove product on cart
    When user select and click product
    And click shopping cart logo
    And remove product
    Then product remove

  Scenario: check shopping cart proses without First Name
    When user select and click product
    And click shopping cart logo
    And click checkout
    And input LastName,Zip/Postal code
    And click continue
    Then show message Error: First Name is required

  Scenario: check shopping cart proses without LastName
    When user select and click product
    And click shopping cart logo
    And click checkout
    And input FirstName,Zip/Postal code
    And click continue
    Then Show there is message Error: Last Name is required

  Scenario: check shopping cart proses without input Zip/Postal
    When user select and click product
    And click shopping cart logo
    And click checkout
    And input FirstName,LastName
    And click continue
    Then there is message Error: Postal Code is required
