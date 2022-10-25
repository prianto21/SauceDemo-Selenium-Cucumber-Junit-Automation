Feature: login test saucedemo
Scenario: login success on saucedemo
Given Open web url "https://www.saucedemo.com/"
And input username "standard_user" and password "secret_sauce"
When click login button
Then Should success login and redirect to homepage  

Scenario Outline: login success scenario
Given Open web url "https://www.saucedemo.com/"
And input username "<username>" and password "<password>"
When click login button
Then Should success login and redirect to homepage
Examples:
|username|password|
|standard_user|secret_sauce|

Scenario Outline: login failed scenario
Given Open web url "https://www.saucedemo.com/"
And input username "<username>" and password "<password>"
When click login button
Then failed login and showing message
Examples:
|username|password|
|standard_user1|secret_sauce1|