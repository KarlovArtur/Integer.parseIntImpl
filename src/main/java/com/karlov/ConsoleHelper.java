package com.karlov;

import java.util.Scanner;

/**
 * This class is a helper that receives input from the console and send
 * the resulting string to the NumberFormatter class
 */
public class ConsoleHelper {

    public static void consoleHelper() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter your string here:  ");
        long result = NumberFormatter.parseInt(scanner.nextLine());
        System.out.println("This is numeric value of your string:  " + result);
    }
}
