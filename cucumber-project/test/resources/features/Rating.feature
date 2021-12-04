Feature: Rating an internship

  Scenario: A rating system divided into multiple categories should exist for each internship
    Given The student enrolled in a certain internship
    And The student has an existing account
    And That internship is posted on the app
    When The student navigates to the internship post
    And The student clicks on the Review button
    Then A list of categories with star rating should be displayed
    When The student rates a category
    Then The rating should be saved