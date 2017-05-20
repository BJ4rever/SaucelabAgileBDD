Feature: User should able to use search functionality to find any product

  @search
  Scenario Outline: User should able to search product

    Given User is on Tesco home page
    When User search for any "<product>"on search menu
    Then User should able to view all related "<product>" as a search result
    Examples:
      | product |
      |Tommee Tippee |
      |Pampers       |
      |Walkers       |