Feature: Validate google title

  Scenario: To validate title of Google
    Given Open Google
    When Read the title
    Then Title should be Google
