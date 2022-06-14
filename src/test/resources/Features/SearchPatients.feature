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

Feature: Search patients records

Scenario: Verifying search patients option
    Given User is on my patients page
    When User clicks search button without entering details
    Then Records of all users are displayed 

Scenario: Verifying search patients option by name filter
    Given User is on my patients page
    When User enters valid "name" in name filter box
    Then Records of requested user is displayed 
    
Scenario: Verifying search patients option by email filter
    Given User is on my patients page
    When User enters valid "email address" in email filter box
    Then Records of requested user is displayed     
    
 Scenario: Verifying search patients option by phone number filter
    Given User is on my patients page
    When User enters valid "phone number" in phone number filter box
    Then Records of requested user is displayed    
    
Scenario: Verifying search patients option by name and phone number filter
    Given User is on my patients page
    When User enters valid "name" with valid "phone number" in name and phone number filter boxes
    Then Records of requested user is displayed 
 
 Scenario: Verifying search patients option by name and email filter
    Given User is on my patients page
    When User enters valid "name" with valid "email address" in name and email filter boxes
    Then Records of requested user is displayed    
     
 Scenario: Verifying search patients option by email and phone number filter
    Given User is on my patients page
    When User enters valid "email address" with valid "phone number" in email and phone number filter boxes
    Then Records of requested user is displayed       
    
 Scenario Outline: Verifying search patients options by entering invalid phone number 
    Given User is on my patients page
    When User enters invalid phone number from "<SheetName>" and <Rownumber> in phone number filter box 
    Then Error message "Invalid input" is displayed
    
    Examples: 
      | SheetName       | Rownumber |
      | invalidphone    |        0  |  
    
    
 Scenario Outline: Verifying search patients options by entering invalid email address
    Given User is on my patients page
    When User enters invalid email address from "<SheetName>" and <Rownumber> in email filter box 
    Then Error message "Invalid input" is displayed
    
     Examples: 
      | SheetName       | Rownumber |
      | invalidemail    |        0  |  
      
 Scenario Outline: Verifying search patients options by entering invalid name
    Given User is on my patients page
    When User enters invalid name from "<SheetName>" and <Rownumber> in name filter box 
    Then Error message "Invalid input" is displayed
    
     Examples: 
      | SheetName       | Rownumber |
      | invalidname     |        0  |      
      
 Scenario: Verifying table header displayed
    Given User is on my patients page
    When User clicks search button with or without entering details
    Then Table header should display number of items found
 
 Scenario: Verifying column name in patients data table
    Given User is on my patients page
    When User clicks search button with or without entering details
    Then Patient data table displays columns name Record Number, Cust ID, Name, Details, Last Visit and Actions 
    
 Scenario: Verifying action column buttons
    Given User is on my patients page
    When User clicks search button with or without entering details
    Then Action column displays View Previous Test Report, View Previous Diet Plans, Create New Report or Plan buttons    
     