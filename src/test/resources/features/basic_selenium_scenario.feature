Feature: Basic selenium scenario

  @current
  Scenario: Open browser on google
    Given the URL base "https://google.com"
    And the browser "chrome"
    When the "local" browser is open
    And the browser is closed
  
  @current
  Scenario: Open browser on google
    Given the domain "https://google.com"
    And the browser "firefox"
    When the "local" browser is open
    And the browser is closed

  @current
  Scenario: Open browser on google
    Given A connection "https://google.com"
    And the browser "chrome"
    When the "local" browser is open
    And the browser is closed