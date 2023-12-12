package com.simplilearn.seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "path_to_chromedriver.exe");

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to a website
        driver.get("https://www.example.com");

        // Find elements using different locators
        WebElement elementById = driver.findElement(By.id("elementId"));
        WebElement elementByName = driver.findElement(By.name("elementName"));
        WebElement elementByClass = driver.findElement(By.className("className"));
        WebElement elementByTag = driver.findElement(By.tagName("tagname"));
        WebElement elementByLinkText = driver.findElement(By.linkText("linkText"));
        WebElement elementByPartialLinkText = driver.findElement(By.partialLinkText("partialLinkText"));
        WebElement elementByCss = driver.findElement(By.cssSelector("cssSelector"));
        WebElement elementByXPath = driver.findElement(By.xpath("//xpath"));

        // Perform actions on found elements

        // Close the browser
        driver.quit();
    }
}
