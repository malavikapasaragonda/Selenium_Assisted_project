package com.simplilearn.seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class CalendarAutomation {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "path_to_chromedriver.exe");

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Implicitly wait for elements to be found (wait up to 10 seconds)
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Navigate to the webpage with the calendar
        driver.get("URL_of_your_webpage_with_calendar");

        // Find the input field to open the date picker
        WebElement datePickerInput = driver.findElement(By.id("datePickerInputId")); // Replace with the actual ID

        // Click on the input field to open the date picker
        datePickerInput.click();

        // Find and select the desired date from the calendar
        WebElement desiredDate = driver.findElement(By.xpath("//td[@data-date='2023-12-25']")); // Replace with the desired date
        desiredDate.click();

        // Perform other actions if needed...

        // Close the browser
        driver.quit();
    }
}
