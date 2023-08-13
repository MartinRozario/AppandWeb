Feature: Payment

  @smoke
  Scenario Outline: Make payment
    Given home page
    When click Make Payment
    And enter '<phone>' and '<name>' and '<amount>'
    And select Country
    Then click Send Payment
    Examples:
      | phone | name | amount |
      | Phone | Name | 2 |
