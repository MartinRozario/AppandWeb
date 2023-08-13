package Runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@CucumberOptions(features = {"src/test/resources/Feature/TC_001_new.feature","src/test/resources/Feature/TC_002_openAccount.feature","src/test/resources/Feature/TC_003_Delete.feature"},
        glue = {"StepDefs"},   monochrome = true,
        dryRun = false,
        tags = "@Smoke1",
        plugin = {"pretty","html:build/reports/feature.html"})
@Test
class CucRunner extends AbstractTestNGCucumberTests{
}