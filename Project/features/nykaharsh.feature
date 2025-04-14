Feature: Shopping and checkout process on Nykaa

  Background:
    Given the browser is opened
    And user navigates to "https://www.nykaa.com/"

  @Launches
  Scenario: Search, filter, and purchase a product
    When user scrolls down to the footer and clicks "New Launches" under "Quick Links"
    Then switch to the new window and verify "Shop New Launches" is displayed
    And user hovers over "Natural" and selects "Face Wash" under "Skin"
    Then verifies "Face Wash" is displayed and applies the third option in the price filter
    And clicks the first product link in the search results and switches to the new window
    Then inputs "620001" in the Delivery Options field and clicks "Check"
    And adds the product to the bag, clicks the "Cart" icon
    Then the Face wash products displayed should be available on the result page.

  @Toner
  Scenario: Search, filter, and purchase a product TONER on Nykaa
   When user clicks on searchBar and searches for "TONER" presses "Enter"
   Then verifies "Toner" is displayed, applies the "New Arrivals" sort, and selects "Avg Customer Rating" filter
   When user clicks on the first product, switches to a new tab, and verifies "inclusive of all taxes" under MRP
   And adds the product to the bag, scrolls to Product Description and click "Ingredients"
   Then clicks on "Read more" and product should be displayed

