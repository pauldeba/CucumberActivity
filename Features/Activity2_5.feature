@activity2_5
Feature: Login Test

Scenario Outline: Testing Login with Example
Given User is on Login page
When User enters "<Usernames>" and "<Password>"
Then Read the page title and confirmation message
And Close the Browser

Examples:
|	Usernames | Password	|
|	admin 		|	password	|
|	adminUser	|	password	|

 