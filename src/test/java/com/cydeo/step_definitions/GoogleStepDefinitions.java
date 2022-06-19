package com.cydeo.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class GoogleStepDefinitions {

   //cukesrunner classını calıştıdık orda çıkan exceptionu kopyaladık. parantez işlerideğişti
    @When("user is on Google search page")
    public void user_is_on_google_search_page() {
        System.out.println("user should");
    }
    @Then("user should see title is Google")
    public void user_should_see_title_is_google() {
        System.out.println("User is seeing title is Google");
    }
}
