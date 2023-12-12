package com.simplilearn.seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementHandling {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "path_to_chromedriver.exe");

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to a website
        driver.get("https://www.example.com");

        // Find the input field by ID
        WebElement inputField = driver.findElement(By.id("someInputId"));

        // Enter text into the input field
        inputField.sendKeys("Hello, Selenium!");

        // Find the submit button by XPath
        WebElement submitButton = driver.findElement(By.xpath("//button[@type='submit']"));

        // Click the submit button
        submitButton.click();

        // Find a link by link text
        WebElement link = driver.findElement(By.linkText("Some Link"));

        // Get the text of the link
        String linkText = link.getText();
        System.out.println("Link Text: " + linkText);

        // Check if the link is displayed
        boolean isLinkDisplayed = link.isDisplayed();
        System.out.println("Is Link Displayed? " + isLinkDisplayed);

        // Perform other actions on web elements...

        // Close the browser
        driver.quit();
    }
}

