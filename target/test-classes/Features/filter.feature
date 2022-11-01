Feature: Filter

  Background: user is logged in
    Given Open webb urll "https://www.saucedemo.com/"
    And input usernamee "standard_user" andd password "secret_sauce"
    When clickk login button
    Then Should success loginn and redirect to homepage

  Scenario: check menu kategori By Name (A to Z)
    When user select kategori Name (A to Z)
    Then user homepage select by Name A to Z

  Scenario: check menu kategori By Name (Z to A)
    When user select kategori Name (Z to A)
    Then user homepage select by Name Z to A

  Scenario: check menu kategori By Price (low to high)
    When user select kategori Price (low to high)
    Then user homepage select by Price low to high

  Scenario: check menu kategori By Price (high to low)
    When user select kategori Price (high to low)
    Then user homepage select by Price high to low
