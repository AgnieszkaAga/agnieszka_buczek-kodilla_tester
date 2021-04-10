Feature: Is divided by 5
  Is divided by 5 and additional by 3

  Scenario Outline: Is divided by 5 and additional by 3
    Given I check <number>
    When I ask whether it's divided by 5 and additional by 3
    Then I get <answer>
    Examples:
      | number | answer |
      | 22 | "None" |
      | 30 | "FizzBuzz" |
      | 50 | "Buzz" |
      | 125 | "Buzz" |