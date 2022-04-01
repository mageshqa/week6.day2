Feature: Edit Lead in LeafTaps website 

@SmokeTest @RegressionTest
Scenario Outline: TC02 - Edit Lead Positive Case 

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
	
	When Click Edit Button 
	And Enters updated Company Name as <companyname> 
	And Click Update button 
	Then 'View Lead' should be displayed 
	
	
	Examples: 
		|username|password|phonenumber|companyname|
		|'Demosalesmanager'|'crmsfa'|'9'|'TCS'|
		|'Demosalesmanager'|'crmsfa'|'7'|'Wipro'|