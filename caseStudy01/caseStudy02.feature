Feature: Login Action

Scenario Outline: Successful login with Valid Credentials
	Given user is open the application
	When User click on to signin link
	And User enters "<username>" and "<password>"
	Then Message displayed Login Successfully
	
	Examples:
	| username | password |
	| Lalitha | Password123 |
	| devilseye | Password420 |
	