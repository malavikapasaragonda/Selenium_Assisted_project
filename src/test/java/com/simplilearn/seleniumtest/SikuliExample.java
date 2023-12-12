package com.simplilearn.seleniumtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class SikuliExample {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "path_to_chromedriver.exe");

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to a webpage
        driver.get("https://www.example.com");

        // Instantiate the SikuliX Screen class
        Screen screen = new Screen();

        try {
            // Load an image pattern of an element to interact with
            Pattern elementPattern = new Pattern("path_to_image_of_element.png");

            // Wait for the element to appear on the screen (timeout in seconds)
            screen.wait(elementPattern, 10);

            // Click on the element using SikuliX
            screen.click(elementPattern);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Perform other actions...

        // Close the browser
        driver.quit();
    }
}
