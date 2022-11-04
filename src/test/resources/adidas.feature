Feature: Place order feature verification

  @adidas
  Scenario: Purchase a laptop
    Given Customer navigation through product categories: Phones, Laptops and Monitors
    When Navigate to "Laptops" → "Sony vaio i5" and click on Add to cart. Accept pop up confirmation.
    And Navigate to homePage → "Laptops" → "Dell i7 8gb" and click on Add to cart. Accept pop up confirmation.
    When Navigate to Cart → Delete "Dell i7 8gb" from cart.
    When Click on Place order.

#    and Fill in all web form fields

    And User enters "Kasgarli Mahmut" to name
    And User enters "Turkistan" to country
    And user enters "Kasgar" to city
    And User enters "1111222233334444" to cardNumber
    And User enters "10" to month
    And User enters "2022" to year
    And Click on Purchase
    And Capture and log purchase Id and Amount.
    And Assert purchase amount equals expected.
    Then Click on Ok


  @adidas1
  Scenario Template: Purchase a laptop

    Given Customer navigation through product categories: Phones, Laptops and Monitors
#    When Navigate to "<category>" → "<product>" and click on Add to cart. Accept pop up confirmation.
    When Navigate to "Laptops" → "Sony vaio i5" and click on Add to cart. Accept pop up confirmation.
    And Navigate to homePage → "Laptops" → "Dell i7 8gb" and click on Add to cart. Accept pop up confirmation.
    When Navigate to Cart → Delete "Dell i7 8gb" from cart.
    When Click on Place order.
    And user enters name "<name>"
    And user enters country "<country>"
    And user enters cityName "<city>"
    And user enters creditCard number "<cardNumber>"
    And user enters month "<month>"
    And user enters year "<year>"
    And Click on Purchase
    And Capture and log purchase Id and Amount.
    And Assert purchase amount equals expected.
    Then Click on Ok

#    Examples:
#      | category | product      |
#      | Laptops  | Sony vaio i5 |
#      | Laptops  | Dell i7 8gb  |

    Examples:
      | name     | country      | city | cardNumber | month | year |
      | Kasgarli Mahmut     | Turkistan      | Kasgar | 1111222233334444 | 1 | 2022 |
      | Satuk Bugra    | Karahanli      | Yarkent | 5555666677778888 | 2 | 2022 |
      | Mehmet Emin Bugra     | Turkistan      | Hotan | 9999000011112222 | 3 | 2022 |



