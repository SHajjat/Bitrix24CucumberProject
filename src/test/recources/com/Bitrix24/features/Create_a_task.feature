Feature: Creating a new task

  @wip
  Scenario: Go to "Activity Stream"
    Given I login as a "helpDesk"
    When I navigate to "Activity Stream"
    Then I should be able to Create a TASK
    And TASK created should be Displayed on "Activity Stream"

