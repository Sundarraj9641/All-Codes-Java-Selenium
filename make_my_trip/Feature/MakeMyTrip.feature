#Author: Team 4
@makemytrip
Feature: MakeMyTrip
#Background: User has already in the Home page of Make My Trip
@succesful_login
Scenario: Successful login with all valid data
Given user is on home page
When user enters all valid data 
Then navigate to booking page