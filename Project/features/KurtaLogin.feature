Feature: Nykaa Kurta Products

  Scenario Outline: User explores for Kurtas and then Sign In
    Given The user inputs kurtas "<search1>" 
    When The user views products of Kurta 
    Then The user chooses and Logs In


Examples:
    | search1 |
    |   Kurtas  |