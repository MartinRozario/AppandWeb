package StepDefs;

import POM.ExpanseElement;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static StepDefs.Login.driver;
public class ExpanseSD {
    ExpanseElement ex;
    @Given("Home Page")
    public void homePage() {
    }

    @When("click Expanse Report")
    public void clickExpanseReport() throws InterruptedException {
        ex=new ExpanseElement(driver);
        ex.clickER();
    }

    @And("click Add and Delete and Back")
    public void clickAddAndDeleteAndBack() throws InterruptedException {
        ex.clicks();
    }

    @Then("click Logout")
    public void clickLogout() throws InterruptedException {
        ex.logOut();
    }
}
