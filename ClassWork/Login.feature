Feature: Login and Logout

@Regression
Scenario: TC02 Login and Logout


#Given User launches LeafTaps website 'leaftaps.com/opentaps/control/login' 
	And User Enters User name as <username> and Password as <password> 
	And User Click on Logon Button 
	Then User lands on 'My Home' page
	