@Invalid_Registration_And_Login
Feature: Parabank Invalid Registration and Login

   @tc_01
   Scenario: Invalid Registration due to already existed username
    Given the user launch the chrome application
    When the user open the Parabank Registration page 
    Then user enters the details 
    And submits the registration and close the browser

    @tc_02
   Scenario: Invalid Registration if any one field is leftblank
    Given the user launchs the chrome application
    When the user open the Parabank Registration Page 
    Then the user enters the details 
    And submits the registration and the closes the browser
    
     @tc_03
    Scenario: Invalid Login due to wrong Username
    Given the user launch the chrome browser
    When the user open the Parabankpage 
    Then user enters the username and password 
    And then login and close the browser
   
   @tc_04
    Scenario: Invalid Login due to wrong Password
    Given the user launchs chrome browser
    When the user opens the Parabankpage 
    Then user enters the username and password in the fields
    And the user login into the application and close browser
    
    @tc_05
    Scenario: Invalid Login due to any of the field left blank
    Given the user launchs the chrome browser
    When the user open the ParabankLoginpage 
    Then user enters username and password
    And  then the user login and close the browser
    