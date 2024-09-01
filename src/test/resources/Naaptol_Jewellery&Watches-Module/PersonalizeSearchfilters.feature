
@tag
Feature: Watches filter feature

  @tag1
  Scenario: To validate the personalize search filter functionality
    Given Open the browser, enter the Naaptol url
    And click on jewellery and watches link
    And then click watches link
    When user clicks on CashondeliveryCheckbox,ExcludeOutofstockCheckbox,ProductswithfreeShippingCheckbox
    And enter the pincode
    And click on set button
    Then Couple Watch (MLGW6) title should be displayed
    And Personalize search status should be diplayed [ON]
    
    
   # @tag2
  #Scenario Outline: Title of your scenario outline
  #  Given I want to write a step with <name>
  #  When I check for the <value> in step
  #  Then I verify the <status> in step

  #  Examples: 
  #    | name  | value | status  |
  #    | name1 |     5 | success |
  #    | name2 |     7 | Fail    |

  
