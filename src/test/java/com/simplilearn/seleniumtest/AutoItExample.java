package com.simplilearn.seleniumtest;

import java.io.File;
import java.io.IOException;

public class AutoItExample {
    public static void main(String[] args) {
        // Path to the compiled AutoIt executable
        String autoItScriptPath = "C:\\Path\\to\\fileUploadScript.exe";

        try {
            // Run the AutoIt executable
            ProcessBuilder pb = new ProcessBuilder(autoItScriptPath);
            pb.directory(new File("C:\\Path\\to\\AutoIt\\Installation\\Folder")); // Set AutoIt installation directory
            Process p = pb.start();
            p.waitFor();
            System.out.println("AutoIt script executed.");
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
