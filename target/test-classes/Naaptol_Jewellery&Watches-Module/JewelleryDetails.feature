
@tag
Feature: Jewellery product feature

  @tag1
  Scenario: To validate jewellery product details page
    Given open the Browser and Enter the Naaptol url
    And mousehover to categories dropdown
    And select jewellery and watches option then click on jewellery
    When user enter the brandname as Tanishq gold jewelleries
    And scroll down and click on a jewellery product
    And mouseHover each image of the jewellery
    And click on add in wishlist icon
    Then Golden Chain + Bracelet + Diamond Ring + Free Digital Watch heading should be visible
    And click on click here to buy button
    And change the quantity from one to two and click on ProceedtoCheckout button

  #@tag2
  #Scenario Outline: Title of your scenario outline
  #  Given I want to write a step with <name>
  #  When I check for the <value> in step
  #  Then I verify the <status> in step

  #  Examples: 
  #    | name  | value | status  |
  #    | name1 |     5 | success |
  #    | name2 |     7 | Fail    |

  
  