package POM;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class ExpanseElement {
    static AndroidDriver driver;
    public ExpanseElement(AndroidDriver driver){
        this.driver=driver;
    }
    public void clickER() throws InterruptedException{
        driver.findElement(By.xpath("//*[@text='Expense Report']")).click();
        Thread.sleep(1000);
    }
    public void clicks() throws InterruptedException{
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@text='Add']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@text='Type goes here']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@text='Back']")).click();
        Thread.sleep(1000);
    }
    public void logOut() throws InterruptedException{
        driver.findElement(By.xpath("//*[@text='Logout']")).click();
        Thread.sleep(6000);
    }
}
