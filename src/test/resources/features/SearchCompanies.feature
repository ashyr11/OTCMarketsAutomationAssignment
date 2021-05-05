Feature: Search for companies and perform validations

  Scenario Outline: Search for companies and verify name, symbol and market cap
    Given User is on home page
    When User searches "<company_symbol>" in Quote
    And User navigates to Quote tab
    And User should verify "<company_name>" and "<company_symbol>"
    When User navigates to Security Details tab
    Then User should verify that market cap on quote page matches with Security Details page
    And Print Market Cap amount and date

    Examples: company symbols
    |company_symbol|company_name          |
    |RHHBY         |Roche Holding Ltd     |
    |OTCM          |OTC Markets Group Inc.|
    |ADBCF         |ADBRI Limited         |


