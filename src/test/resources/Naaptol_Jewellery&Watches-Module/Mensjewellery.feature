
@tag
Feature: Men Jewellery feature

  @tag1
  Scenario: To validate the Men jewellery link functionality
    Given Browser open, enter url
    And click on categories dropdown
    And click on Jewellery and watch link
    When user click on Men jewellery link
    And check the exclude out of stock checkbox
    And enter the brandname in the select by brands section
    And check the Vellani checkbox and price range checkbox
    Then Golden Rakhi Bracelet jewellery should be visible
    And click on add to compare checkbox
    And click on the Golden Rakhi Bracelet product link

 # @tag2
 # Scenario Outline: Title of your scenario outline
 #   Given I want to write a step with <name>
 #   When I check for the <value> in step
 #   Then I verify the <status> in step

 #   Examples: 
 #     | name  | value | status  |
 #     | name1 |     5 | success |
 #     | name2 |     7 | Fail    |
