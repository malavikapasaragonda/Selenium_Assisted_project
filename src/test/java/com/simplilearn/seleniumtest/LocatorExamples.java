package com.simplilearn.seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorExamples {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "path_to_chromedriver.exe");

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to a website
        driver.get("https://www.example.com");

        // Find element using CSS Selector
        WebElement elementByCss = driver.findElement(By.cssSelector("#elementId")); // Using ID

        // Find element using XPath
        WebElement elementByXPath = driver.findElement(By.xpath("//input[@name='username']")); // Finding input element with attribute name='username'

        // Perform actions on found elements

        // Close the browser
        driver.quit();
    }
}
