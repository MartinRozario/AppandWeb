package StepDefs;

import Core.AppHelper;
import POM.AppElement;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.net.MalformedURLException;



public class Login {
    AppElement appElement;
    static AndroidDriver driver;
    @Given("app apk is there")
    public void appApkIsThere() throws MalformedURLException, InterruptedException {
        AppHelper ah=new AppHelper();
        driver=ah.apkLaunch();
    }

    @When("user enters {string}and {string}")
    public void userEntersUsernameAndPassWord(String username, String passWord) throws InterruptedException{
        appElement=new AppElement(driver);
        appElement.inputField(username, passWord);

    }

    @Then("user will navigate to home screen")
    public void userWillNavigateToHomeScreen() {
        System.out.println("USer will navigate to home screen");
    }
}
