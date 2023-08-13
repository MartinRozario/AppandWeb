package POM;
import  io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AppElement {
    static AndroidDriver driver;

    public AppElement(AndroidDriver driver) {
        this.driver = driver;
    }

    public void inputField(String username, String passWord) throws InterruptedException {

        Thread.sleep(1000);
        driver.findElement( By.xpath("//*[@text='OK']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@text='Username']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@text='Username']")).sendKeys(username);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@text='Password']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@text='Password']")).sendKeys(passWord);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@text='Login']")).click();

    }
}