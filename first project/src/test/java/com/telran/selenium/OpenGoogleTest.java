package com.telran.selenium;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.Test;

public class OpenGoogleTest {
    WebDriver driver;
    @Test
    public void setUp() throws InterruptedException {
      driver = new ChromeDriver();
      driver.get("https://www.google.com");
      driver.findElement(By.name("q")).sendKeys("java");
      driver.findElement(By.name("q")).click();
      Thread.sleep(4000);
      driver.quit();

    }
    }

