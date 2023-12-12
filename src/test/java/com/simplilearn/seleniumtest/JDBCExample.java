package com.simplilearn.seleniumtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "path_to_chromedriver.exe");

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Database connection parameters
        String dbURL = "jdbc:mysql://localhost:3306/your_database";
        String username = "your_username";
        String password = "your_password";

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            // Establish database connection
            connection = DriverManager.getConnection(dbURL, username, password);

            // Create a SQL statement
            statement = connection.createStatement();

            // Execute a query
            String query = "SELECT * FROM your_table";
            resultSet = statement.executeQuery(query);

            // Process the results
            while (resultSet.next()) {
                // Access data from the result set
                String data = resultSet.getString("column_name");
                System.out.println("Data from database: " + data);

                // Perform actions in Selenium based on retrieved data
                // For example, interact with web elements using the retrieved data
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                // Close the resources
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        // Close the browser
        driver.quit();
    }
}
