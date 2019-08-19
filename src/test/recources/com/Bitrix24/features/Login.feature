Feature: Login
  Agile story:
  As a user I should be able to create a task from activity stream.
@wip
  Scenario: Login as "helpDesk"
    Given I am on the login page
    When I login as a "helpDesk"
    And I navigate to "Activity Stream"
    Then I should be able to see "Activity Stream" page



