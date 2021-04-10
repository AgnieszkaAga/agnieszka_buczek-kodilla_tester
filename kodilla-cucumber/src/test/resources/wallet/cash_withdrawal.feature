Feature: Cash Withdrawal
  Scenario: Successful withdrawal from a wallet in credit
    Given I have deposited $200 in my wallet
    When I request $30
    Then $30 should be dispensed

    Scenario: Failed withdrawal - not enough money in wallet
      Given I have deposited $100 in my wallet
      When I request $101
      Then $0 should be dispensed

    Scenario: Successful withdrawal - withdrawing of all amount from wallet
      Given I have deposited $300 in my wallet
      When I request $300
      Then wallet balance should be 0

  Scenario: Failed withdrawal - request of negative amount
    Given I have deposited $500 in my wallet
    When I request $-1
    Then $0 should be dispensed