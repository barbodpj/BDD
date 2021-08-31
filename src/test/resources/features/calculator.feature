@tag
Feature: Calculator
  Scenario: check pass
    given Input value 0
    When I check if he has passed
    Then I expect the result 0

