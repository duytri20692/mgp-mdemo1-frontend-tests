@SubmitAnInvalidApplication
Feature: Submit an invalid application.

  Scenario Outline: Verify user cannot make a payment if input invalid data.
    Given User open the Mozaic application and go to the Mortgage Prequalification Request page
    When User select answers as "<House>", "<Primary>", "<Employed>" and "<SingleBuyer>"
    And Click on the Next button
    Then User should see we are sorry page
    And User should see the message "Werex sorry you declined our process!"

    Examples:
      | House | Primary | Employed | SingleBuyer |
      | N     | Y       | Y        | Y           |
      | Y     | N       | Y        | Y           |
      | Y     | Y       | N        | Y           |
      | Y     | Y       | Y        | N           |

