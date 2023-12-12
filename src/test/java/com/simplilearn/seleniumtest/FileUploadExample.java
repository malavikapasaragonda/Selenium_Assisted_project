package com.simplilearn.seleniumtest;

import java.io.File;
import java.io.IOException;

public class FileUploadExample {
    public static void main(String[] args) {
        String autoItScriptPath = "C:\\Path\\to\\fileUploadScript.exe"; // Path to the compiled AutoIt script

        try {
            // Run the AutoIt executable
            ProcessBuilder pb = new ProcessBuilder(autoItScriptPath);
            pb.directory(new File("C:\\Path\\to\\AutoIt\\Installation\\Folder")); // Set AutoIt installation directory
            Process p = pb.start();
            p.waitFor();
            System.out.println("File upload completed using AutoIt.");
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
