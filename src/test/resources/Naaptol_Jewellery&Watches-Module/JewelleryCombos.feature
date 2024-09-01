
@tag
Feature: Jewellery combos feature

  @tag1
  Scenario: To validate the Jewellery combos link functionality
    Given open the browser, enter the Naaptol Url
    And Click on jewelleryAndwatches link
    And then click on jewellery link
    And Click on Jewellery combos link
    When user enter the pinCode and Brandname
    And check the Vellani checkbox and Sukkhi checkbox
    And user check the more than fiftyPercent discount checkbox
    And user enter the price range limit and click on Go button
    Then a error message No product found for this filter combination should be displayed

  #@tag2
  #Scenario Outline: Title of your scenario outline
  #  Given I want to write a step with <name>
  #  When I check for the <value> in step
  #  Then I verify the <status> in step

  #  Examples: 
  #    | name  | value | status  |
  #    | name1 |     5 | success |
  #    | name2 |     7 | Fail    |
