Feature: Basic selenium scenario

  @current
  Scenario: Open browser on google
    Given the URL base "http://google.com"
    And the browser "chrome"
    When the "local" browser is open
    And the browser is closed
  
  @current
  Scenario: Open browser on google
    Given the domain "http://google.com"
    And the browser "firefox"
    When the "local" browser is open
    And the browser is closed

  @current
  Scenario: Open browser on google
    Given A connection "http://google.com"
    And the browser "chrome"
    When the "local" browser is open
    And the browser is closed