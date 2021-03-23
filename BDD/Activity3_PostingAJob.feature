@activity1_3

Feature: Posting a job using parameterization

Scenario: Post a job using details passed from the Feature file
    Given User is on Alchemy Jobs page
	When User clicks on Post a Job	
	Given User is on Login page
	When User enters "admin" and "password"
	Then Read the page title and confirmation message
	And Close the Browser
	
Examples:
| email | JobTitle | Location | JobType | CompanyName |
| mail@mail.com| tester | Pune | Fulltime | IBM |