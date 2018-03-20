Feature: Hotel Room Booking
 
  Scenario: User should be able to book a room
  	
  		Given Open chrome and navigate to hotel web application
  		
  		When  User enter valid username and password 
  		
  		Then  User Should be able to login successfuly
  		
  		Then  User select location, number of rooms, and gender specification
  		
  		When  User hit the submit button
  		
  		Then  User should be able to navigate to the next page 
  		
  		Then  User select radio button and continue 
  		
  		Then  User enter Full name, Address and payment information
  		
  		When  User hit book now button
  		
  		Then  User should be able to navigate to the logout page 
  		
  		When  User hit the logout link 
  		
  		Then  User Should loged out and navigated to the main page 
  		
    


