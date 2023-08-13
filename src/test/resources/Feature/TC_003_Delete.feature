Feature: Delete Customer
  @Smoke1
  Scenario Outline:Deleting Customer
    Given Click Customer Tab
    When User input for search '<name>'
    And User click on the Delete button
    Then Close browser

    Examples:
      |name |
      |Martin |