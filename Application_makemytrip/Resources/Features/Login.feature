#Author: Team 4
@makemytrip
Feature: MakeMyTrip
#Background: User has already in the Home page of Make My Trip
@succesful_login
Scenario: Successful login with all valid data
Given user is on make My Trip Application
When user enters all valid data
And click on continue button
Then user is navigate to the Home page
