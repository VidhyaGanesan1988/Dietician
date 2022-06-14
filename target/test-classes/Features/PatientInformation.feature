#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Verifying Patients Information
  
  Scenario: Verify each patient has cutomer ID
    Given User has hit search button 
    When Patients record is displayed
    Then Each patient "cust ID" is be displayed
 
 Scenario: Verify each patient has Name
    Given User has hit search button 
    When Patients record is displayed
    Then Each patient "Name" is dispalyed
    
  Scenario: Verify each patient has Details
    Given User has hit search button 
    When Patients record is displayed
    Then Each patient "email", "phone number" and "location" is dispalyed   
    
 Scenario: Verify view patients previuos test reports action button
    Given User has hit search button 
    When User clicks on View Previous Test Reports button
    Then User is redirected to View Previous Test Reports "page"
    
Scenario: Verify view patients previuos diet plans action button
    Given User has hit search button 
    When User clicks on View Previous Diet Plans button
    Then User is redirected to Generated Diet Plans "page"   
    
 Scenario: Verify create new report or plan action button
    Given User has hit search button 
    When User clicks on Create New Report or Plan button
    Then User is redirected to Confirm Health Conditions and Generate a New Diet plan "page"    