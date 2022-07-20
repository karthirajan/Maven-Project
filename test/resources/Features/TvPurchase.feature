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
Feature: TvPurchase
  I want to use this template for my feature file

  @tag1
  Scenario: TV purchase
  	Given user launches flipkart Application
    And user login in to flipkart
    When user search Tv	
    Then user receive order confirmation message
    @tag2
  Scenario: Mobile one dimensional list
    Given user launches flipkart Application
    And user login in to flipkart
    When user search mobile	by using one dim list
  	|realme|APPLE|Samsung|
    Then user receive order confirmation message
    
    @tag3
  Scenario: Mobile one dimensional map
    Given user launches flipkart Application
    And user login in to flipkart
    When user search mobile	by using one dim map
  	|phone1|APPLE iPhone|
  	|phone2|SAMSUNG|
  	|phone3|realme|
    Then user receive order confirmation message
    
    Scenario Outline: All Mobiles
    Given user launches flipkart Application
    And user login in to flipkart
    When user search mobile	"<Phones>"
    Then user receive order confirmation message
    
    Examples:
    |Phones|
    |APPLE iPhone|
    |SAMSUNG|
    |realme|
  