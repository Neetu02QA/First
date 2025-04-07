
    Feature: Application Login
    
    Background:
    Given setup the enteries in database
    When launch the browser from config variables
    And hit the home page url of banking site
    
		@MobileTest @NetBanking
		Scenario: User page default login
    
    Given User is on Netbanking Landing page
    When User login into application with "user" and password "0953"
    Then Home Page is displayed
    And Cards are displayed
	
		@SmokeTest @RegressionTest @Mortgage
		Scenario Outline: Mortgage User page default login
  	
  	Given User is on Netbanking Landing page
  	When User login into application with "<Username>" and password "Password" combination
  	Then Home page is displayed
  	And Cards are displayed

    Examples: 
      | Username   |  | Password |
      | debituser  |  | hello12  |
      | credituser |  | lpo213   |
 
		
    
