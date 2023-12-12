package com.simplilearn.seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "path_to_chromedriver.exe");

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to a website
        driver.get("https://www.google.com/");

        // Find an element by ID and perform actions
        WebElement element = driver.findElement(By.id("someElementId"));
        element.sendKeys("Hello, Selenium!");

        // Perform other operations, assertions, or validations

        // Close the browser
        driver.quit();
    }
}
