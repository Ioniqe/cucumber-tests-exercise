Feature: Contact other users

  Scenario: A user should be able to communicate and contact other users
    Given The user is on the other user's profile page
    When The user clicks on the Message button
    Then A popup with the chat appears
    When The user writes a message in the chat
    Then The message should be sent to the other user

