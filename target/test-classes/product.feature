Feature: Verifying the Amazon App Details

  Scenario Outline: Place the order
    Given user is on the amazon app
    When User select language
    And User select sigin option
    And User search the "<product>"
    And User select the first item and place order
    Then User verify the product place dor not

    Examples: 
      | product |
      | iphone  |
