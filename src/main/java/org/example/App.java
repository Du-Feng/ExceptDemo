package org.example;

import java.io.*;

/**
 * The main class to start the application
 */
public class App {
    /**
     * The main function to start the application
     * @param args
     */
    public static void main(String[] args) {
        FileReader fr = null;
        try {
            File file = new  File("E://file.txt");
            fr = new FileReader(file);
            char[] a = new char[50];
            fr.read(a);
            for (char c : a) {
                System.out.println(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fr.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
    }
}
