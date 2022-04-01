Feature: Delete Lead in LeafTaps website 

@RegressionTest @FunctionalTest
Scenario Outline: TC05 - Delete Lead Positive Case 

	Given User Enters User name as <username> and Password as <password> 
	And User Click on Logon Button 
	Then 'My Home' should be displayed 
	
	When User clicks on Lead tab 
	Then 'My Leads' should be displayed 
	
	When User Clicks on Find Lead link under Shortcuts section 
	Then 'Find Leads' should be displayed 
	
	When Enters Phone Number as <phonenumber> 
	And  Click Find Lead button 
	Then Open first Lead from result 
	
	When Click Delete button 
	And Click Find Lead link under Shortcuts section 
	Then Search by Lead ID 
	And Click search button 
	And Verify Lead account matches 
	
	
	Examples: 
		|username|password|phonenumber|
		|'Demosalesmanager'|'crmsfa'|'9'|
		|'Demosalesmanager'|'crmsfa'|'8'|