Feature: Nykaa Lipstick
@Lipstick
    Scenario Outline: THe user searches for a Lipstick 
    Given the user searches for lipstick "<searchFor>" 
    When the user clicks a product and chooses shade 
    And the user wants to Contact 
    And the user adds the product to wishlist 
    Then the user checks how to add items 

    Examples:
        | searchFor |
        | Lipstick  |
