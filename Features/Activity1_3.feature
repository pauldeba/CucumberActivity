@activity1_3
Feature: Testing with Tags

@SimpleAlart @SmokeTest
Scenario: Testing with Simple Alart
	Given User is on the Page
	When User clicks the Simple Alert button
	Then Alart Opens
	And Read the text from it and print it
	And Close the alert
	And Close Browser

@ConfirmAlart
Scenario: Testing with Confirm Alart
	Given User is on the Page
	When User clicks the Confirm Alert button
	Then Alart Opens
	And Read the text from it and print it
	And Close the alart with Cancel
	And Close Browser

@PromptAlart
Scenario: Testing with Prompt Alart
	Given User is on the Page
	When User click the Prompt Alert button
	Then Alart Opens
	And Read the text from it and print it
	And Write a custom message in it
	And Close the alert
	And Close Browser
