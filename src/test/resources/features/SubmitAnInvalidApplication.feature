@RegressionTest
Feature: Submit an invalid application.

  Scenario Outline: Verify user input invalid data on the Prequalification screen.
    Given User go to the Prequalification page and select user as "<User>"
    When User select answers as "<House>", "<Primary>", "<Employed>" and "<SingleBuyer>"
    And Click on the Next button
    Then User should see we are sorry page
    And User should see the message "Werex sorry you declined our process!"

    Examples:
      | User       | House | Primary | Employed | SingleBuyer |
      | Test User1 | N     | Y       | Y        | Y           |
      | Test User1 | Y     | N       | Y        | Y           |
      | Test User1 | Y     | Y       | N        | Y           |
      | Test User1 | Y     | Y       | Y        | N           |

  Scenario Outline: Verify user input invalid data on the Consent page.
    Given User go to the Prequalification page and select user as "<User>"
    When User select answers as "<House>", "<Primary>", "<Employed>" and "<SingleBuyer>"
    Then Click on the Next button
    And User click on Consent checkbox with value is "<consent>"
    And Click on the Next button
    Then User should see we are sorry page
    And User should see the message "Werex sorry you declined our process!"

    Examples:
      | User       | House | Primary | Employed | SingleBuyer | consent |
      | Test User2 | Y     | Y       | Y        | Y           | N       |

  Scenario Outline: Verify user input invalid data on the Planing to Spend page.
    Given User go to the Prequalification page and select user as "<User>"
    When User select answers as "<House>", "<Primary>", "<Employed>" and "<SingleBuyer>"
    Then Click on the Next button
    And User click on Consent checkbox with value is "<consent>"
    And Click on the Next button
    And User input on Spend money text box with value is "<spend>"
    And Click on the Next button
    And User should see an error message as "<SpendPageErrorMessage>"

    Examples:
      | User       | House | Primary | Employed | SingleBuyer | consent | spend  | SpendPageErrorMessage     |
      | Test User3 | Y     | Y       | Y        | Y           | Y       |        | Please enter a value      |
      | Test User3 | Y     | Y       | Y        | Y           | Y       | abc    | Please enter only numbers |
      | Test User3 | Y     | Y       | Y        | Y           | Y       | abc123 | Please enter only numbers |
      | Test User3 | Y     | Y       | Y        | Y           | Y       | 123!@  | Please enter only numbers |
      | Test User3 | Y     | Y       | Y        | Y           | Y       | 12     | That's little short, mate |

  Scenario Outline: Verify user input invalid data on the Down Payment page.
    Given User go to the Prequalification page and select user as "<User>"
    When User select answers as "<House>", "<Primary>", "<Employed>" and "<SingleBuyer>"
    Then Click on the Next button
    And User click on Consent checkbox with value is "<Consent>"
    And Click on the Next button
    And User input on Spend money text box with value is "<Spend>"
    And Click on the Next button
    And User input on Down payment money text box with value is "<DownPayment>"
    And Click on the Next button
    And User should see an error message as "<DownPaymentPageErrorMessage>"

    Examples:
      | User       | House | Primary | Employed | SingleBuyer | Consent | Spend  | DownPayment | DownPaymentPageErrorMessage |
      | Test User3 | Y     | Y       | Y        | Y           | Y       | 500000 |             | Please enter a value        |
      | Test User3 | Y     | Y       | Y        | Y           | Y       | 500000 | abc         | Please enter only numbers   |
      | Test User3 | Y     | Y       | Y        | Y           | Y       | 500000 | abc123      | Please enter only numbers   |
      | Test User3 | Y     | Y       | Y        | Y           | Y       | 500000 | 123!@       | Please enter only numbers   |
      | Test User3 | Y     | Y       | Y        | Y           | Y       | 500000 | 12          | That's little short, mate   |

  Scenario Outline: Verify user input invalid data on the Gross Income page.
    Given User go to the Prequalification page and select user as "<User>"
    When User select answers as "<House>", "<Primary>", "<Employed>" and "<SingleBuyer>"
    Then Click on the Next button
    And User click on Consent checkbox with value is "<Consent>"
    And Click on the Next button
    And User input on Spend money text box with value is "<Spend>"
    And Click on the Next button
    And User input on Down payment money text box with value is "<DownPayment>"
    And Click on the Next button
    And User input on Gross income text box with value is "<GrossIncome>"
    And Click on the Next button
    And User should see an error message as "<GrossIncomePageErrorMessage>"

    Examples:
      | User       | House | Primary | Employed | SingleBuyer | Consent | Spend  | DownPayment | GrossIncome | GrossIncomePageErrorMessage |
      | Test User3 | Y     | Y       | Y        | Y           | Y       | 500000 | 400000      |             | Please enter a value        |
      | Test User3 | Y     | Y       | Y        | Y           | Y       | 500000 | 400000      | abc         | Please enter only numbers   |
      | Test User3 | Y     | Y       | Y        | Y           | Y       | 500000 | 400000      | abc123      | Please enter only numbers   |
      | Test User3 | Y     | Y       | Y        | Y           | Y       | 500000 | 400000      | 123!@       | Please enter only numbers   |
      | Test User3 | Y     | Y       | Y        | Y           | Y       | 500000 | 400000      | 12          | That's little short, mate   |

  Scenario Outline: Verify user input invalid data on the Gross Income page.
    Given User go to the Prequalification page and select user as "<User>"
    When User select answers as "<House>", "<Primary>", "<Employed>" and "<SingleBuyer>"
    Then Click on the Next button
    And User click on Consent checkbox with value is "<Consent>"
    And Click on the Next button
    And User input on Spend money text box with value is "<Spend>"
    And Click on the Next button
    And User input on Down payment money text box with value is "<DownPayment>"
    And Click on the Next button
    And User input on Gross income text box with value is "<GrossIncome>"
    And Click on the Next button
    And User input on Monthly Expenses text box with value is "<MonthlyExpenses>"
    And Click on the Next button
    And User should see an error message as "<GrossIncomePageErrorMessage>"

    Examples:
      | User       | House | Primary | Employed | SingleBuyer | Consent | Spend  | DownPayment | GrossIncome | MonthlyExpenses | GrossIncomePageErrorMessage |
      | Test User3 | Y     | Y       | Y        | Y           | Y       | 500000 | 400000      | 80000       |                 | Please enter a value        |
      | Test User3 | Y     | Y       | Y        | Y           | Y       | 500000 | 400000      | 80000       | abc             | Please enter only numbers   |
      | Test User3 | Y     | Y       | Y        | Y           | Y       | 500000 | 400000      | 80000       | abc123          | Please enter only numbers   |
      | Test User3 | Y     | Y       | Y        | Y           | Y       | 500000 | 400000      | 80000       | 123!@           | Please enter only numbers   |
      | Test User3 | Y     | Y       | Y        | Y           | Y       | 500000 | 400000      | 80000       | 12              | That's little short, mate   |

