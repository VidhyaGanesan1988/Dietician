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

Feature: Verify View Previuos Test Reports Page

  Scenario: Verify breadcrumbs on test report page
    Given User clicks on button View Previous Test Reports
    When User is on View Patient Test Reports page
    Then page displays breadcrumbs as Dietician Softaware- View Recent Test Reports
    
  Scenario: Verify page title
    Given User clicks on button View Previous Test Reports
    When User is on View Patient Test Reports page
    Then Title is displayed as "title" View Patient Test Reports 

  Scenario: Verify primary information of a user
    Given User clicks on button View Previous Test Reports
    When User is on View Patient Test Reports page
    Then Page displays primary information like patient Id  number, name, email address, Phone number, Address
    
  Scenario: Verify table headers
    Given User clicks on button View Previous Test Reports
    When User is on View Patient Test Reports page
    Then Table displays column heading as Record number, Doc-ID, File Uploaded time, File/Report name, Identified health conditions
    
   Scenario: Verify table contents
    Given User clicks on button View Previous Test Reports
    When User is on View Patient Test Reports page
    Then  Table content displays document number, view PDF, uploaded time, file name, health condition of each patient
    
  Scenario: Verify Signout button 
    Given User clicks on button View Previous Test Reports
    When User is on View Patient Test Reports page   
    Then Signout button is displayed in the page as "SIGNOUT"
    
    Scenario: Verify pagination
    Given User clicks on button View Previous Test Reports
    When User is on View Patient Test Reports page   
    Then only three records displayed in one page
    
    Scenario: Verify pagination navigation
    Given User clicks on button View Previous Test Reports
    When User is on View Patient Test Reports page   
    Then Number of pages containing each three records is displayed