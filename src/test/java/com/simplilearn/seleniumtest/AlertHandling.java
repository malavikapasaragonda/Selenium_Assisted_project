package com.simplilearn.seleniumtest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class AlertHandling {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "path_to_chromedriver.exe");

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Implicitly wait for elements to be found (wait up to 10 seconds)
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Navigate to a webpage containing an alert
        driver.get("https://www.example.com"); // Replace with the URL of a webpage with alerts

        // Find the button/link to trigger an alert
        driver.findElement(By.id("alertButton")).click(); // Replace with the actual element that triggers the alert

        // Handling JavaScript Alert
        Alert alert = driver.switchTo().alert();

        // Get the text from the alert and print it
        String alertText = alert.getText();
        System.out.println("Alert Text: " + alertText);

        // Accept (OK) the alert
        alert.accept(); // To click OK on the alert, use accept()

        // Navigate to a webpage containing a confirmation alert
        driver.get("https://www.example.com"); // Replace with the URL of a webpage with a confirmation alert

        // Find the button/link to trigger a confirmation alert
        driver.findElement(By.id("confirmButton")).click(); // Replace with the actual element that triggers the confirmation alert

        // Handling Confirmation Alert
        Alert confirmationAlert = driver.switchTo().alert();

        // Dismiss (Cancel) the confirmation alert
        confirmationAlert.dismiss(); // To click Cancel on the confirmation alert, use dismiss()

        // Navigate to a webpage containing a prompt alert
        driver.get("https://www.example.com"); // Replace with the URL of a webpage with a prompt alert

        // Find the button/link to trigger a prompt alert
        driver.findElement(By.id("promptButton")).click(); // Replace with the actual element that triggers the prompt alert

        // Handling Prompt Alert
        Alert promptAlert = driver.switchTo().alert();

        // Enter text into the prompt alert
        promptAlert.sendKeys("Some text to enter");
        promptAlert.accept(); // To accept the prompt with entered text, use accept()

        // Close the browser
        driver.quit();
    }
}
