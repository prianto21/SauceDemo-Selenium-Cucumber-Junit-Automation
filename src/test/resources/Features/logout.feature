Feature: log out test saucedemo
Scenario: log out test 
Given Open Web url "https://www.saucedemo.com/"
And input Username "standard_user" and password "secret_sauce"
When click login btn
And click burger menu
And click logout
Then user redirect to form login