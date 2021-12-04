package com.examples.cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Internship {
    @Given("The organizer is logged in the organization's profile")
    public void theOrganizerIsLoggedInTheOrganizationsProfile() {
        System.out.println("Internship Step 1");
    }

    @When("The organizer clicks on the Post button")
    public void theOrganizerClicksOnThePostButton() {
        System.out.println("Internship Step 2");
    }

    @Then("A popup with multiple text fields should be displayed")
    public void aPopupWithMultipleTextFieldsShouldBeDisplayed() {
        System.out.println("Internship Step 3");
    }

    @When("The organizer inputs the name {string}, description {string}, requirements {string} and payment {string}")
    public void theOrganizerInputsTheNecessaryInfo(String name, String description, String requirements, String payment) {
        System.out.println("Internship Step 4");
        System.out.println("Input example for step 4: " + name + ", " + description + ", " + requirements + ", " + payment);
    }

    @Then("Submits by clicking on the Post button")
    public void submitsByClicking() {
        System.out.println("Internship Step 5");
    }

    @Then("A popup message saying {string} should be displayed")
    public void aPopupMessageShouldBeDisplayed(String message) {
        System.out.println("Internship Step 6");
        System.out.println("Message example for step 6: " + message);
    }
}
