package StepDefs;

import POM.MortgageElement;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static StepDefs.Login.driver;
public class MortgageSD {
    MortgageElement mort;
    @Given("Home page")
    public void homePage() {
    }

    @When("click Make Mortgage Request")
    public void clickMakeMortgageRequest() throws InterruptedException {
        mort=new MortgageElement(driver);
        mort.clickMort();
    }

    @And("enter {string} and {string} and {string} and {string} and {string} and {string}")
    public void enterFirstAndLastAndAgeAndAddAndAddAndCountryandclickNext(String first,String last,String age,String add1,String add2,String country) throws InterruptedException {
        mort=new MortgageElement(driver);
        mort.inputField(first, last, age, add1, add2, country);
    }
    @Then("select Type and years and Occupation and Income")
    public void selectTypeAndYearsAndOccupationAndIncome() throws InterruptedException {
        mort.tyoiSelect();
    }
}
