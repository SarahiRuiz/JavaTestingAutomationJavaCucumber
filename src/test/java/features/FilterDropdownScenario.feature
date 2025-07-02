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
@tag
Feature: Filter Dropdown Test Cases
  I want to use this template for my filter dropdown

  @tag1
  Scenario: Filter By Index
    Given Go To Page Sauce Demo
    And Fill User Name <userName>
    And Fill Password <password>
    And Click on Login Button
    When Select Prodcut Filter By Index <index>
    Then Verify First Title
    
    Examples: 
      | userName        | password       | index  |
      | "standard_user" | "secret_sauce" | 3      |

	@tag1
  Scenario: Filter By Value
    Given Go To Page Sauce Demo
    And Fill User Name <userName>
    And Fill Password <password>
    And Click on Login Button
    When Select Prodcut Filter By Value <value>
    Then Verify First Title
    
    Examples: 
      | userName        | password       | value  |
      | "standard_user" | "secret_sauce" | "lohi" |
      
	@tag1
  Scenario: Filter By Element Visible
    Given Go To Page Sauce Demo
    And Fill User Name <userName>
    And Fill Password <password>
    And Click on Login Button
    When Select Prodcut Filter By Element Visible <element>
    Then Verify First Title
    
    Examples: 
      | userName        | password       | element               |
      | "standard_user" | "secret_sauce" | "Price (low to high)" |
