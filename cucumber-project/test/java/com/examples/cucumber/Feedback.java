package com.examples.cucumber;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Feedback {
    @Given("The user is on an organization's profile page")
    public void theStudentIsOnAnOrganizationSProfilePage() {
        System.out.println("Feedback Step 1");
    }

    @And("A textfield for leaving reviews is available on the bottom of the page")
    public void aTextFieldForLeavingReviewsIsAvailableOnTheBottomOfThePage() {
        System.out.println("Feedback Step 2");
    }


    @When("The user writes in the textfield area")
    public void theStudentWritesInTheTextfieldArea() {
        System.out.println("Feedback Step 3");
    }

    @And("The user clicks on the Submit button")
    public void theStudentClicksOnTheSubmitButton() {
        System.out.println("Feedback Step 4");
    }

    @Then("A popup with a success message should be displayed")
    public void aPopupWithASuccessMessageShouldBeDisplayed() {
        System.out.println("Feedback Step 5");
    }
}
