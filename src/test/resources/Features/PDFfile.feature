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

Feature: PDF File

  Scenario: Verify View PDF action
    Given User is on View Patient Test Reports page
    When User clicks on View PDF button
    Then PDF is opened in proper readable format
  
 Scenario: Verify contents of PDF file
    Given User has clicked view PDF button
    When User is on PDF file
    Then Patient details is displayed in PDF
    
  Scenario: Verify contents of PDF file
    Given User has clicked view PDF button
    When User is on PDF file
    Then Doctor details is displayed in PDF  
    
  Scenario: Verify contents of PDF file
    Given User has clicked view PDF button
    When User is on PDF file
    Then PDF displays list of conditions, preferences list, Co-morbidites
    
   Scenario: Verify contents of PDF file
    Given User has clicked view PDF button
    When User is on PDF file
    Then PDF displays diet menu for seven days, any warning and comments mentioned by doctor  