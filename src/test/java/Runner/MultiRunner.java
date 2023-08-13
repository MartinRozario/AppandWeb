package Runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@CucumberOptions(features = {"src/test/resources/Feature/001_Login.feature",
        "src/test/resources/Feature/002_Payment.feature",
        "src/test/resources/Feature/003_Mortgage.feature",
        "src/test/resources/Feature/004_Expanse.feature"},
        glue = {"StepDefs"},   monochrome = true,
        dryRun = false,
        tags = "@smoke",
                plugin ={ "pretty","html:build/reports/eriBank.html"})
@Test
class MultiRunner extends AbstractTestNGCucumberTests{
}
