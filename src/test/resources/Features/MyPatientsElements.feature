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

Feature: My Patients page elements
 
  Scenario: Verifying breadcrumbs in the page
    Given User is on home page "Home" after login 
    When User clicks on My Patients tab
    Then page displays breadcrumbs as Dietician Softaware-My Patients

  Scenario: Validating the My patients page title 
    Given User is on home page "Home" after login 
    When User clicks on My Patients tab
    Then page title is displayed as "My Patients"
    
 Scenario: Verifying the search button feature
    Given User is on home page "Home" after login 
    When User clicks on My Patients tab
    Then search button is displayed as "Search"

   Scenario: Verifying the textbox feature 
    Given User is on home page "Home" after login 
    When User clicks on My Patients tab
    Then Name, email and phone number filters are displayed
    
  