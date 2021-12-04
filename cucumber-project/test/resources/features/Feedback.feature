Feature: Feedback

  Scenario: The user should be able to leave feedback on the organization
    Given The user is on an organization's profile page
    And A textfield for leaving reviews is available on the bottom of the page
    When The user writes in the textfield area
    And The user clicks on the Submit button
    Then A popup with a success message should be displayed
