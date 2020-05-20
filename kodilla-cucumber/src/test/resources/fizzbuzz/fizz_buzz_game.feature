Feature: Fizz Buzz game
  I want to pass a number and see the correct answer

  Scenario Outline: Get answer based on played number
    Given number is <number> of value greater than zero
    When I pass a number
    Then I should be told the correct <answer>
    Examples:
    | number | answer |
    | multiples of three | "Fizz" |
    | multiples of five  | "Buzz" |
    | multiples of both three and five |"FizzBuzz" |
    | other numbers                    | "None"    |
