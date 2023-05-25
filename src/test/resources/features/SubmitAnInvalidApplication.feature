@SubmitAnInvalidApplication
Feature: Submit an invalid application.

  Scenario Outline: Verify user cannot make a payment if input invalid data on the Prequalification screen.
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

  Scenario Outline: Verify user cannot make a payment if input invalid data on the Consent page.
    Given User go to the Prequalification page and select user as "<User>"
    When User select answers as "<House>", "<Primary>", "<Employed>" and "<SingleBuyer>"
    Then Click on the Next button
    And User click on Consent checkbox with value is "<consent>"
    And Click on the Next button
    Then User should see we are sorry page
    And User should see the message "Werex sorry you declined our process!"

    Examples:
      | User       | House | Primary | Employed | SingleBuyer | consent |
      | Test User5 | Y     | Y       | Y        | Y           | N       |
