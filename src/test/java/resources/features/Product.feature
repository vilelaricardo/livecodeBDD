Feature: Store Products
  Scenario: Get all products in my store
    Given I have more than 5 products in my store
    And One of these products is a CellPhone
    Then All product should be returned successfully