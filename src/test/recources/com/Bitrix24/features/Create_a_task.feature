Feature: Creating a new task

  Scenario: Go to "Activity Stream"
    Given I login as a "helpDesk"
    When I navigate to "Acticity Stream"
    Then I should be able to Create a TASK
    And TASK created should be Displayed on "Activity Stream"

