package StepDefs;

import POM.PaymentElement;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static StepDefs.Login.driver;

public class PaymentSD {
    PaymentElement app;
    @Given("home page")
    public void homePage() {
    }

    @When("click Make Payment")
    public void clickMakePayment() throws InterruptedException {
        app=new PaymentElement(driver);
        app.ClickMakePayment();
    }

    @And("enter {string} and {string} and {string}")
    public void enterPhoneAndNameAndAmount(String phone, String name, String amount) throws InterruptedException {
        app=new PaymentElement(driver);
        app.inputField(phone,name,amount);
    }

    @And("select Country")
    public void selectCountry() throws InterruptedException {
        app=new PaymentElement(driver);
        app.clickCountry();
    }

    @Then("click Send Payment")
    public void clickSendPayment() throws InterruptedException {
        app.clickSend();
    }
}
