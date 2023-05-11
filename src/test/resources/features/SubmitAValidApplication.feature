@SubmitAnApplication
Feature: Submit an application.

  Scenario Outline: Verify user can make a payment after login to the system.
    Given User go to the Prequalification page and select user as "<User>"
    When User select answers as "<House>", "<Primary>", "<Employed>" and "<SingleBuyer>"
    Then Click on the Next button
    And User click on Consent checkbox with value is "<consent>"
    And Click on the Next button
    And User input on Spend money text box with value is "<spend>"
    And Click on the Next button
    And User input on Down payment money text box with value is "<downPayment>"
    And Click on the Next button
    And User input on Gross income text box with value is "<grossIncome>"
    And Click on the Next button
    And User input on Monthly Expenses text box with value is "<monthlyExpenses>"
    And Click on the Next button
    Then User should see the Summary Review Page
    When User click on the Submit button
    And User should see the Congratulations page
    And User should see the Congratulations message as "You have qualified for our Mortgage Prequalification Program."

    Examples:
      | User       | House | Primary | Employed | SingleBuyer | consent | spend  | downPayment | grossIncome | monthlyExpenses |
      | Test User5 | Y     | Y       | Y        | Y           | Y       | 500000 | 400000      | 80000       | 1500            |
