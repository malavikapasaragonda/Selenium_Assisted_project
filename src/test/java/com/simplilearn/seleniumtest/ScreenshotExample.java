package com.simplilearn.seleniumtest;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import java.io.IOException;

public class ScreenshotExample {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "path_to_chromedriver.exe");

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to a website
        driver.get("https://www.example.com");

        // Capture screenshot
        try {
            // Convert WebDriver object to TakesScreenshot
            TakesScreenshot screenshot = (TakesScreenshot) driver;

            // Capture screenshot as File
            File srcFile = screenshot.getScreenshotAs(OutputType.FILE);

            // Save the screenshot to a specific location
            String destPath = "path_to_save_screenshot/screenshot.png";
            org.apache.commons.io.FileUtils.copyFile(srcFile, new File(destPath));
              System.out.println("Screenshot captured and saved at: " + destPath);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Close the browser
        driver.quit();
    }
}
