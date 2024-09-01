
@tag
Feature: Rings and Earings feature

  @tag1
  Scenario: To validate the Rings & Earings link functionality
    Given open the browser and enter the Naaptol.com Url
    And Click on jewellery&watches dropdown
    And click on Jewellery link
    When user click on rings and earings link
    And check all the checkboxes of personalize search section
    And enter the pincode and click on set button
    Then No product found for this filter combination, message should be displayed
   

  #@tag2
  #Scenario Outline: Title of your scenario outline
  #  Given I want to write a step with <name>
  #  When I check for the <value> in step
  #  Then I verify the <status> in step

  #  Examples: 
  #    | name  | value | status  |
  #    | name1 |     5 | success |
  #    | name2 |     7 | Fail    |
