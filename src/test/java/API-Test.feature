Feature: API test 

Scenario: Should see LIST USERS of all existing users 
	Given I get the default list of users for on 1st page 
	When I get the list of all users 
		|data|
		|200|
		|first_name|
	Then I should see total users count equals to number of user ids 
		|responseDelayInms|
		|3000|
		
		
		#provide valid user ID , flow is successful in that case
Scenario: Should see SINGLE USER NOT FOUND error code 
	Given I make a search for user with below ID 
		|userID|
		|55|
	Then I receive error code in response 
		|successfulRequestStatusCode|
		|404|
		
Scenario Outline: CREATE a user 
	Given I create user with following <Name> <Job> 
	Then response should contain folowing data 
		|id|createdAt|
		
		
	Examples: 
		| Name  | Job     |
		| Peter | Manager |
		| Liza  | Sales   |
		
		
		
Scenario: LOGIN - SUCCESSFUL by a user 
	Given I login succesfully with following data 
		| eve.holt@reqres.in | cityslicka |200|
		
		
		
Scenario: LOGIN - UNSUCCESSFUL by a user 
	Given I login unsuccesfully with following data 
	
		| eve.holt@reqres.in|hkjhdkjdf|400|
		
		
		
		
		#configure time that response will delay in feature file
Scenario: Should see list of users with DELAYED RESPONSE 
	Given I wait for user list to load 
		|responseDelayInms|
		|9000|
	Then I should see that every user has a unique id 
	
	