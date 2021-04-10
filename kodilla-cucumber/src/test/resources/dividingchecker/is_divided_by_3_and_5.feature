Feature: Is divided by 3 and 5
  Is divided by 3 and 5

  Scenario Outline: Is divided by 3 and 5
    Given I check <number>
    When I ask whether it's divided by 3 and 5
    Then I get <answer>
    Examples:
      | number | answer |
      | 19 | "None" |
      | 150 | "FizzBuzz" |
      | 60 | "FizzBuzz" |