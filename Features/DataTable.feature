@datatable
Feature: Login Test

Scenario:
Given User is on Login page
When User enters credentials:
	|	admin |	password |
	|	admin |	passwordr|
	|	administrator	|	admin	|
Then Read the page title and confirmation message
And Close the Browser