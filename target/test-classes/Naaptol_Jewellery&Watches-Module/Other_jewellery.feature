
@tag
Feature: Other jewellery feature


  @tag1
  Scenario: To validate the other jewellery link functionality
    Given Open the Chromebrowser and enter the Naaptol.com Url
    And mouseHover on Shopping categories dropdown 
    And click on Jewellery&watch link
    And click on other jewellery link
    When user uncheck all the checkboxes
    And enter the price range and click on Go button
    Then Only this Golden Chain + Bracelet + Ring with Free Watch product should be displayed
   
		
  #@tag2
  #Scenario Outline: Title of your scenario outline
  #  Given I want to write a step with <name>
  #  When I check for the <value> in step
  #  Then I verify the <status> in step

  #  Examples: 
  #    | name  | value | status  |
  #    | name1 |     5 | success |
  #    | name2 |     7 | Fail    |

  