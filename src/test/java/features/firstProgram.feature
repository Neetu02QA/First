#Feature: Application Login
#
#Scenario: Admin Page default login
#Given User is on Netbanking Landing page
#When User login into application
#Then Home Page is displayed
#And Cards are displayed

#Feature: Application Login

  #Scenario: Admin Page default login
  #Given User is on Netbanking Landing page
  #When User login into application with "admin" and password "1234"
  #Then Home Page is displayed
  #And Cards are displayed
  #Reusable
  #Scenario: user page default login
  #Given User is on Netbanking Landing page
  #When User login into application with "user" and password "0953"
  #Then Home Page is displayed
  #And Cards are displayed
  #
  #Scenario: User page default login
  #Given User is on Netbanking Landing page
  #When User login into application with "debituser" and password "0953"
  #Then Home Page is displayed
  #And Cards are displayed
  #
  #Scenario: User page default login
  #Given User is on Netbanking Landing page
  #When User login into application with "stocksuser" and password "0953"
  #Then Home Page is displayed
  #And Cards are displayed
  #Scenario Outline: User page default login
  #Given User is on Netbanking Landing page
  #When User login into application with "<Username>" and password "Password" combination
  #Then Home page is displayed
  #And Cards are displayed
  #
  #Examples:
  #| Username   |  | Password |
  #| debituser  |  | hello12  |
  #| credituser |  | lpo213   |
  #user name is integer .. regex pattern
  #Scenario: user page default login
  #Given User is on Netbanking Landing page
  #When User login into application with user and password "0953"
  #Then Home Page is displayed
  #And Cards are displayed
  #
  #Scenario Outline: User page default login
  #Given User is on Netbanking Landing page
  #When User login into application with <Username> and password "Password" combination
  #Then Home page is displayed
  #And Cards are displayed
  #
  #Examples:
  #| Username   |  | Password |
  #| debituser  |  | hello12  |
  #| credituser |  | lpo213   |
  
  
  #Scenario: user page default login
    #Given User is on Netbanking Landing page
    #When User login into application with "user" and password "0953"
    #Then Home Page is displayed
    #And Cards are displayed
#	
#	@SmokeTest
  #Scenario Outline: User page default login
    #Given User is on Netbanking Landing page
    #When User login into application with "<Username>" and password "Password" combination
    #Then Home page is displayed
    #And Cards are displayed
#
    #Examples: 
      #| Username   |  | Password |
      #| debituser  |  | hello12  |
      #| credituser |  | lpo213   |
#	@SmokeTest
  #Scenario: User Page deafult Sign up
    #Given User is on Practice landing page
    #When User Signup into application
      #| rahul             |
      #| shettyn           |
      #| contact2email.com |
      #|        3129750688 |
    #Then Home page is displayed
    #And Cards are displayed
    #
    
    
    Feature: Application Login
    
    Background:
    Given setup the enteries in database
    When launch the browser from config variables
    And hit the home page url of banking site
    
    @RegressionTest
    Scenario: Admin Page default login
  	
  	Given User is on Netbanking Landing page
  	When User login into application with "admin" and password "1234"
  	Then Home Page is displayed
		And Cards are displayed
	
		@MobileTest
		Scenario: user page default login
    
    Given User is on Netbanking Landing page
    When User login into application with "user" and password "0953"
    Then Home Page is displayed
    And Cards are displayed
	
		@SmokeTest @RegressionTest
		Scenario Outline: User page default login
  	
  	Given User is on Netbanking Landing page
  	When User login into application with "<Username>" and password "Password" combination
  	Then Home page is displayed
  	And Cards are displayed

    Examples: 
      | Username   |  | Password |
      | debituser  |  | hello12  |
      | credituser |  | lpo213   |
 
		
    
