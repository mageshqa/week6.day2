Feature: Create Lead in LeafTaps website 

@SmokeTest
Scenario Outline: TC01 - Create Lead Positive Case 

	Given User Enters User name as <username> and Password as <password> 
	And User Click on Logon Button 
	Then 'My Home' should be displayed 
	#But Username or Password is incorrect 
	
	
	When User clicks on Lead tab 
	Then 'My Leads' should be displayed 
	
	When User Clicks on Create Lead link under Shortcuts section 
	Then 'Create Lead' should be displayed 
	
	When Enters new Company Name as <companyname> 
	And Enters First Name as <firstname> 
	And Enters Last Name as <lastname> 
	And Clicks Create Lead Button 
	
	Then User comes to Lead Summary page 
	
	Examples: 
		|username|password|companyname|firstname|lastname|
		|'Demosalesmanager'|'crmsfa'|'TCS'|'James'|'Cameron'|
		|'Demosalesmanager'|'crmsfa'|'PCS'|'Adam'|'Gilchrist'|
