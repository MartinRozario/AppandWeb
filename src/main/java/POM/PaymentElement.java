package POM;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
public class PaymentElement {
    static AndroidDriver driver;
    public PaymentElement(AndroidDriver driver) {
        this.driver = driver;
    }
    public void ClickMakePayment() throws InterruptedException{
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@text='Make Payment']")).click();
    }
    public void inputField(String phone, String name, String amount) throws InterruptedException {

        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@text='Phone']")).sendKeys(phone);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@text='Name']")).sendKeys(name);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@text='Amount']")).sendKeys(amount);
    }
    public void clickCountry() throws InterruptedException{
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@text='Select']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@text='India']")).click();
    }
    public void clickSend()throws InterruptedException{
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@text='Send Payment']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@text='Yes']")).click();
    }
}