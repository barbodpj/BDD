@tag
Feature: Pass
  Scenario: check pass
    given Input value 0
    When I check if he has passed
    Then I expect the result 0

  Scenario Outline: check multiple pass
    Given Input value <first>
    When I check if he has passed
    Then I expect the result <result>

    Examples:
      | first | result |
      | 0     | 0   |
      | 5     | 0   |
      | 10    | 1   |
      | 20    | 1  |
      | 7    | 0  |
