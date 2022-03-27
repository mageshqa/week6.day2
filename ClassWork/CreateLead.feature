Feature: Create Lead in LeafTaps website 

@Smoke
Scenario Outline: TC01 - Create Lead Positive Case 

	Given User Enters User name as <username> and Password as <password> 
	And User Click on Logon Button 
	Then User lands on 'My Home' page 
	
	When User clicks on Lead tab 
	Then User lands on 'My Lead' page 
	
	When User Clicks on Create Lead link under Shortcuts section 
	Then User lands on Create Lead page 
	
	When Enters Company Name as <companyname> 
	And Enters First Name as <firstname> 
	And Enters Last Name as <lastName> 
	And Clicks Create Lead Button 
	
	Then User comes to Lead Summary page 
	
	Examples: 
		|username|password|companyname|firstname|lastname|
		|'Demosalesmanager'|'crmsfa'|'TCS'|'James'|'Cameron'|
		|'demosalesCRM'|'crmsfa'|'Wipro'|'Stephen'|'Spielberg'|