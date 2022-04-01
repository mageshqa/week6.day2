Feature: Merge Lead in LeafTaps website 

@RegressionTest
Scenario Outline: TC04 - Merge Lead Positive Case 

	Given User Enters User name as <username> and Password as <password> 
	And User Click on Logon Button 
	Then 'My Home' should be displayed 
	
	When User clicks on Lead tab 
	Then 'My Leads' should be displayed 
	
	When User Clicks on Merge Lead link under Shortcuts section 
	Then 'Merge Leads' should be displayed 
	
	When Enters First Lead Name as <firstname> 
	And Enters Second Lead Name as <secondname> 
	And Click Merge Lead Button 
	And User Clicks on Find Lead link under Shortcuts section 
	
	Then Search by Lead ID 
	And Click search button 
	And Verify Lead account matches 
	
	Examples: 
		|username|password|firstname|secondname|
		|'Demosalesmanager'|'crmsfa'|'A'|'C'|
		|'Demosalesmanager'|'crmsfa'|'S'|'S'|