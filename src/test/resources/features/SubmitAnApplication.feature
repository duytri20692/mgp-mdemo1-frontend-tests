@SubmitAnApplication
Feature: Submit an application.

  Scenario Outline: Verify user can make a payment after login to the system.
    Given User open the Mozaic application and go to the Mortgage Prequalification Request page
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
    And User should see the Congratulations message as "Your rate of 3.8% is garanteed for 90 days, starting today!"

    Examples:
      | House | Primary | Employed | SingleBuyer | consent | spend | downPayment | grossIncome | monthlyExpenses |
      | Y     | Y       | Y        | Y           | Y       | 200000 | 3000        | 50000        | 1500             |
#      | N              | N                | N                 | N                    |Y|
#      | Y              | N                | Y                 | N                    |Y|
#      | N              | N                | Y                 | Y                    |Y|

