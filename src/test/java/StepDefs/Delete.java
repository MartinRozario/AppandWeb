package StepDefs;

import POM.DeleteElements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static StepDefs.UserDataInput.driver;

public class Delete {
    DeleteElements web3;
    @Given("Click Customer Tab")
    public void clickCustomerTab() throws InterruptedException {
        web3 = new DeleteElements(driver);
        web3.CustomerTab();
    }

    @When("User input for search {string}")
    public void userInputForSearchName(String First) throws InterruptedException {
        web3.SearchCustomer(First);
    }

    @And("User click on the Delete button")
    public void userClickOnTheDeleteButton() throws InterruptedException {
        web3.DeleteCust();
    }

    @Then("Close browser")
    public void closeBrowser() {
        web3.CloseBrowser();
    }
}
