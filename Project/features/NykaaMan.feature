

Feature: Nykaa Man Whey Protein 


    @WheyProtein
    Scenario Outline: User searches for Whey Protein 

    Given the user clicks on Nykaa Man 
    When the user lands on NykaMan page
    Then user views the first product with pincode "<pincode>" 

    Examples:
        | pincode | 
        | 600001  | 