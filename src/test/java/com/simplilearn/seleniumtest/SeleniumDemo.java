package com.simplilearn.seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable (downloaded separately)
        System.setProperty("webdriver.chrome.driver", "path_to_chromedriver.exe");

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to a website
        driver.get("https://www.example.com");

        // Find an element by ID and perform actions
        WebElement element = driver.findElement(By.id("someElementId"));
        element.sendKeys("Hello, Selenium!"); // Input text into the element

        // Find an element by CSS selector and perform a click
        WebElement button = driver.findElement(By.cssSelector("button.submit"));
        button.click(); // Click on the button

        // Perform other operations, assertions, or validations

        // Close the browser
        driver.quit();
    }
}
