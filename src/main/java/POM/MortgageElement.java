package POM;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class MortgageElement {
    static AndroidDriver driver;

    public MortgageElement(AndroidDriver driver) {
        this.driver = driver;
    }
    public void clickMort() throws InterruptedException{
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@text='Mortgage Request']")).click();
    }
    public void inputField(String first,String last,String age,String add1,String add2,String country) throws InterruptedException {

        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@text='First Name']")).click();
        driver.findElement(By.xpath("//*[@text='First Name']")).sendKeys(first);
        driver.findElement(By.xpath("//*[@text='Last Name']")).sendKeys(last);
        driver.findElement(By.xpath("//*[@text='Age']")).sendKeys(age);
        driver.findElement(By.xpath("//*[@text='Address 1']")).sendKeys(add1);
        driver.findElement(By.xpath("//*[@text='Address 2']")).sendKeys(add2);
        driver.findElement(By.xpath("//*[@text='Country']")).sendKeys(country);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@text='Next']")).click();
    }
    public void tyoiSelect() throws InterruptedException{
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@text='Professional']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@text='20']")).click();
        Thread.sleep(1000);
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"50,00,000\"));"));
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//*[@text='Business'])")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@text='20,00,000']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@text='Save']")).click();
    }
}