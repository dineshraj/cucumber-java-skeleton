Feature: Checkout

  Background:
    Given the following products
      | espresso  | 2  |
      | croissant | 1  |

  Scenario: Buy 3 espressos
    When I sell 3 espresso
    Then the total should be £6

  Scenario: Sell expressos and croissants
    When I sell 2 espresso
    And I sell 3 croissant
    Then the total should be £7
