Feature: Is it Friday yet?
  Everybody wants to know when it's Friday

  Scenario: Sunday isn't Fridays
    Given today is Sunday
    When I ask whether it's Friday yet
    Then I should be told "Nope"

  Scenario: Monday isn't Fridays
    Given today is Monday
    When I ask whether it's Friday yet
    Then I should be told "Nope"