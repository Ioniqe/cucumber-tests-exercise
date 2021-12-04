Feature: Internship Post

  Scenario: The organizer should be able to post internship information
    Given The organizer is logged in the organization's profile
    When The organizer clicks on the Post button
    Then A popup with multiple text fields should be displayed
    When The organizer inputs the name "Amazon Java Internship", description "Apply for an awesome internship", requirements "Must know Java" and payment "$5000/month"
    And Submits by clicking on the Post button
    Then A popup message saying "Successfully posted!" should be displayed
