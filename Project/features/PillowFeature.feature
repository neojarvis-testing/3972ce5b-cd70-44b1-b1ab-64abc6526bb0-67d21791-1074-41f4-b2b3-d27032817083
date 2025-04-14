

Feature: Mykaa Pillow Search

    Scenario Outline: User searches for pillow

    Given The user searches for pillow "<search>"
    And the user clicks on first product 
    Then the user adds the product to bag 

    Examples:
        | search |
        | Pillow  |