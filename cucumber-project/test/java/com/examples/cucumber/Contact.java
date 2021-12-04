package com.examples.cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Contact {
    @Given("The user is on the other user's profile page")
    public void theUserIsOnTheOthersProfilePage() {
        System.out.println("Contact Step 1");
    }


    @When("The user clicks on the Message button")
    public void theUserClicksOnTheMessageButton() {
        System.out.println("Contact Step 2");
    }

    @Then("A popup with the chat appears")
    public void aPopupWithTheChatAppeas() {
        System.out.println("Contact Step 3");
    }

    @When("The user writes a message in the chat")
    public void theUserWritesAMessageInTheChat() {
        System.out.println("Contact Step 4");
    }

    @Then("The message should be sent to the other user")
    public void theMessageShouldBeSentToTheOtherUser() {
        System.out.println("Contact Step 5");
    }
}
