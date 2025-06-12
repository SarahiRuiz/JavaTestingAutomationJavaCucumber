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
Feature: Radio Button Test Cases
  I want to use this template for radio button test cases

  #@tag1
  #Scenario: Radio Button Yes
  #  Given I want to write a step with precondition
  #  And some other precondition
  #  When I complete action
  #  And some other action
  #  And yet another action
  #  Then I validate the outcomes
  #  And check more outcomes

	#Scenario Outline
  @Smoke1
  Scenario Outline:  Radio Button Yes
    Given Going To Page <url>
    When Wait And Select Radio Button Yes
    Then Verify Radio Button Yes Selected

    Examples: 
      | url  |
      | "https://demoqa.com/radio-button" |
      
  #Scenario Outline
  @Smoke2
  Scenario Outline:  Radio Button Dynamic Method
    Given Going To Page <url>
    When Click Dynamic Radio Button <radioButtonOption>
    Then Verify Radio Button <expectedResult> Selected

    Examples: 
      | url                               |  radioButtonOption | expectedResult |
      | "https://demoqa.com/radio-button" | "Yes"              | "Yes"        |
      | "https://demoqa.com/radio-button" | "Impressive"       | "Impressive"        |
