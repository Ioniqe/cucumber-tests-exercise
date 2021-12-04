package com.examples.cucumber;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Rating {
    @Given("The student enrolled in a certain internship")
    public void theStudentEnrolledInACertainInternship() {
        System.out.println("Rating Step 1");
    }

    @And("The student has an existing account")
    public void theStudentHasAnExistingAccount() {
        System.out.println("Rating Step 2");
    }

    @And("That internship is posted on the app")
    public void thatInternshipIsPostedOnTheApp() {
        System.out.println("Rating Step 3");
    }

    @When("The student navigates to the internship post")
    public void theStudentNavigatesToTheInternshipPost() {
        System.out.println("Rating Step 4");
    }

    @And("The student clicks on the Review button")
    public void theStudentClicksOnTheReviewButton() {
        System.out.println("Rating Step 5");
    }

    @Then("A list of categories with star rating should be displayed")
    public void aListOfCategoriesWithAStarRatingShouldBeDisplayed() {
        System.out.println("Rating Step 6");
    }

    @When("The student rates a category")
    public void theStudentRatesACategory() {
        System.out.println("Rating Step 7");
    }

    @Then("The rating should be saved")
    public void theRatingShouldBeSaved() {
        System.out.println("Rating Step 8");
    }
}
