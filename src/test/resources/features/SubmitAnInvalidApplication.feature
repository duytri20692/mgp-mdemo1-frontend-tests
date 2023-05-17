@SubmitAnInvalidApplication
Feature: Submit an invalid application.

  Scenario Outline: Verify user cannot make a payment if input invalid data.
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

