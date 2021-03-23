@activity1_1
Feature: Create a New User

Scenario: Visit the site’s backend and create a new user
Given User is on Alchemy users page
When User enters "root" and "pa$$w0rd"
Then Click on menu item that says 'Users'
Then Click on Add New button
Then Fill necessary details
And Click on Add New User button
And Close the Browser