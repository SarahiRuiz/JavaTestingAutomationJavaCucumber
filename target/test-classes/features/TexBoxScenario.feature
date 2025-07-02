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
@Smoke
Feature: Text Box Test Cases
  I want to use this template for Text Box Test Cases

  @Smoke1
  Scenario Outline: Text Box Valid
    Given Going To Page Text Box
    When Fill Full Name <FullName>
    And Fill Email <Email>
    And Fill Current Address <currentAddress>
    And Fill Permanent Address <permanentAddress>
    Then Click Submit

    Examples: 
      |  FullName     | Email                   |  currentAddress   |  permanentAddress |
      | "Test Name"   | "test1@test.com"        |  "Address C1"     |  "Address P1"     |
      | "Test1 Name2" | "test2@test.com"        |  "Address C2"     |  "Address P2"     |
