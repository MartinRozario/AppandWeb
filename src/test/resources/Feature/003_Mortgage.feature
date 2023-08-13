Feature: Mortgage

  @smoke
  Scenario Outline: Make Mortgage request
    Given Home page
    When click Make Mortgage Request
    And enter '<first>' and '<last>' and '<age>' and '<Add1>' and '<Add2>' and '<country>'
    Then select Type and years and Occupation and Income
    Examples:
      | first | last | age | Add1 | Add2 | country |
      | Mart | Rozor | 2 | Add1# | Add2-0 | country |