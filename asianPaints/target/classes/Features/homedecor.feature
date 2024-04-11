Feature:Homedecor Functionality
This will help us to test Homedecor functionality of AsianPaints application
#Background: Login Page
#Given User is on home page
#When User clicks on login button
#Then User enters mobile number
#And User clicks on submit button
#When User enters OTP
#Then User again clicks on submit button
@tag1
Scenario:View Homedecor
Given user is on Homedecor page 
When user clicks on sofas 
Then it should redirect to the sofas
And user should view the specific sofas
Then user is on Amritsar
Then user clicks on findstore


@tag2
Scenario:Open Storage and Wardrobes
Given user is on Homedecor page1
And user clicks on Storage and Wardrobes
When user clicks on recommended Wardrobes
And  user is on SelectCity
Then user chooses one city
And user clicks on findstore
Then Book a visit 
And  user will try to write name
Then Submit the details

@tag3
Scenario Outline: Wallpapers
Given user is on Homedecor page
When user is on Wallpaper website select one design
And user can redirect to designer collection
Then user clicks on any design
Then write "<pincode>"
And user clicks on check
And click on Add To Cart
Examples:
|pincode|
|411007 |
|411001 |
|411023 |

@tag4
Scenario: Open interior Design Service
Given user is on Homedecor
When user is on interior Design Service
When user enter the name
And user enter the Email
And user enter the mobile
Then user enter to the Pincode
And Book Free site visit

@tag5
Scenario: View Homestore in Bathroom fitting
Given user is on HomeDecor
When user clicks on Bathroom fitting
Then user locate your nearest location
And user clicks on view store
