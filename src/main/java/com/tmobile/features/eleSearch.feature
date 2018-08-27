Feature: Text search in google page

Scenario Outline: Validate 3rd top link is clicked and displayed the right page for text elephant

	Given user opens google page
	When user is on the google page
	Then user enters the "<text>" in search field  
	Then result page is displayed
	Then click on 3rd top level link on that page
	Then validate link page title
	Examples:
	|text|
	|elephant|