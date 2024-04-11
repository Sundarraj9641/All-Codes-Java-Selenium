@Flights
Feature: Booking flight
@one_way
Scenario: Booking the flight under one way
Given user is on the flight booking page
When user click on one way button
When user select the from city
When user select the to city
When user select the date of traveling
When user enter the details of passengers
And click on search
Then user is able to see the available flights

@Round_trip
Scenario: Booking the flight under round trip
Given user is on the flight booking page in roundTrip
When user click on Round trip button in roundTrip
When user select the from city in roundTrip
When user select the to city in roundTrip
When user select the date of traveling in roundTrip
When user enter the details of passengers in roundTrip
And click on search in roundTrip
Then user is able to see the available flights in roundTrip