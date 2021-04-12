# new feature
# Tags: optional

Feature: Prevent users from taking out more money than their wallet contains

  Scenario Outline: User tries to take out more money than their balance
    Given there is <amount> in my wallet
    When I withdraw <withdrawalAmount>
    Then nothing should be dispensed
    And I should be told that I don't have enough money in my wallet
    Examples:
    | amount | withdrawalAmount |
    | 100  | 200 |
    | 300 |  500 |
    | 250 |  251 |
    | 0   |  300 |
