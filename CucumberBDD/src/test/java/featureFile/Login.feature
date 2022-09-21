Feature: Login

Scenario: open browser enter test url login page is displayed
          enter valid username and password,click on login, home page should be displayed.
          
Given open browser and enter test url
Then login page is displayed
When enter valid username and password
And click on login button
Then Home page is displayed          