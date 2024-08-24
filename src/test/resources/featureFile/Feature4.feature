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
@UAT
Feature: Feature-4
@smoke 
Scenario: Scenario-1 in Feature-4
@sanity
Scenario: Scenario-2 in Feature-4
@smoke @sanity
Scenario: Scenario-3 in Feature-4
@sanity @regresion
Scenario: Scenario-4  in Feature-4
@regresion
Scenario: Scenario-5 in Feature-4
@smoke @sanity @regresion
Scenario: Scenario-6 in Feature-4