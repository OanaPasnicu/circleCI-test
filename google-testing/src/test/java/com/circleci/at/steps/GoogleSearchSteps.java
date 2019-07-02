package com.circleci.at.steps;

import com.circleci.at.pages.GoogleSearch;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchSteps {

    private ChromeDriver driver;
    private GoogleSearch googleSearch;

    public GoogleSearchSteps() {
        if (driver == null) {
            driver = new ChromeDriver();
        }
        googleSearch =  PageFactory.initElements(driver, GoogleSearch.class);
    }

    @Given("I open the Google page")
    public void iOpenTheGooglePage() {
        driver.navigate().to("https://www.google.com/");
    }

    @And("I enter the {string} keyword")
    public void iEnterTheKeyword(String keyword) {
        googleSearch.enterKeyword(keyword);
    }

    @And("I press {string} button")
    public void iPressButton(String arg0) {
        googleSearch.search();
    }

    @Then("the results page is displayed")
    public void theResultsPageIsDisplayed() {
    }

    @After
    public void quit() {
        driver.quit();
    }
}

