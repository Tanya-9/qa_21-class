package com.telran.selenium;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginToEbay extends TestBase{
    @Test
    public void loginTest() {
        driver.get("https://www.ebay.com");

        click();

        driver.findElement(By.id("userid")).click();
        driver.findElement(By.id("userid")).clear();
        driver.findElement(By.id("userid")).sendKeys("gdhdj@gdfdf.com");

        driver.findElement(By.id("pass")).click();
        driver.findElement(By.id("pass")).clear();
        driver.findElement(By.id("pass")).sendKeys("1234567");

        driver.findElement(By.id("sgnBt")).click();
    }

    public void click(By locator) {
        driver.findElements(locator).click();
    }

}
