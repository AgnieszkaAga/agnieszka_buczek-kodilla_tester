Feature: Is divided by 3
  Is divided by 3 and additional by 5

  Scenario Outline: Is divided by 3 and additional by 5
    Given I check <number>
    When I ask whether it's divided by 3 and additional by 5
    Then I get <answer>
    Examples:
    | number | answer |
    | 17 | "None" |
    | 15 | "FizzBuzz" |
    | 21 | "Fizz" |
    | 9 | "Fizz" |