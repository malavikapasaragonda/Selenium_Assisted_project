package com.simplilearn.seleniumtest;

//Import necessary Selenium libraries
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumExample {
 public static void main(String[] args) {
     // Set path to ChromeDriver executable
     System.setProperty("webdriver.chrome.driver", "path_to_chromedriver.exe");

     // Initialize Chrome WebDriver
     WebDriver driver = new ChromeDriver();

     // Open a website
     driver.get("https://www.example.com");

     // Find elements by different locators and perform actions

     // 1. Find element by ID and perform a click action
     WebElement linkElement = driver.findElement(By.id("someId"));
     linkElement.click();

     // 2. Find element by name and input text
     WebElement textField = driver.findElement(By.name("username"));
     textField.sendKeys("myusername");

     // 3. Find element by CSS Selector and clear text
     WebElement passwordField = driver.findElement(By.cssSelector("input[type='password']"));
     passwordField.clear();

     // 4. Find element by XPath and get text
     WebElement header = driver.findElement(By.xpath("//h1"));
     String headerText = header.getText();
     System.out.println("Header text: " + headerText);

     // 5. Find multiple elements by class name and loop through them
     java.util.List<WebElement> links = driver.findElements(By.className("someClass"));
     for (WebElement element : links) {
         System.out.println("Link: " + element.getAttribute("href"));
     }

     // Perform other actions like navigating back, refreshing the page, etc.
     driver.navigate().back();
     driver.navigate().refresh();

     // Close the browser window
     driver.quit();
 }
}
