@activity1_2
Feature: Login Test

Scenario: Testing Login
    Given User is on Alchemy Jobs page
    When User clicks on Jobs
    Then Enter searchterm IBM in search input field
   	Then Verify full time Jobs filter is selected
 	Then Click on any Job in list
 	And Find the title of the job and print it
    Then Click on Apply for Job
    And Close the Browser
    