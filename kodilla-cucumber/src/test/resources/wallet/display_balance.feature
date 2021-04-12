# new feature
# Tags: optional

Feature: Display balance

  Scenario Outline: User checks the balance of their wallet
    Given there is <amount> in my wallet
    When I check the balance of my wallet
    Then I should see that the balance is <displayedAmount>
    Examples:
    | amount | displayedAmount |
    | 100 | 100 |
    | 524 | 524 |
    | 1250 | 1250 |
    | 0 | 0 |
    | 1 | 1 |