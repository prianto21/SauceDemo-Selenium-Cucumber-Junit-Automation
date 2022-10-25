Feature: login test saucedemo
Scenario: login without username and password 
Given Open web url "https://www.saucedemo.com/"
And input username "" and password ""
When click login button
Then failed login and showing message  

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

Scenario: login without input username 
Given Open web url "https://www.saucedemo.com/"
And input username "" and password "secret_sauce"
When click login button
Then failed login and showing message

Scenario: login without input password 
Given Open web url "https://www.saucedemo.com/"
And input username "standart_user" and password ""
When click login button
Then failed login and showing message
