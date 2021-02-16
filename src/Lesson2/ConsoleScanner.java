package Lesson2;

import java.util.Scanner;

/**
 * Example program of a console input scanner.
 * DON'T MODIFY This program
 *
 * To RUN this program click on the [GREEN PLAY ARROW]
 */
public class ConsoleScanner {
    public static void main(String args[]) {

        /* 1.  Print message to console */
        System.out.println("Starting up console scanner example program.");

        /* 2.  Create/Assemble a scanner object to prepare for reading user input */
        Scanner input = new Scanner(System.in);

        /* 3.  Print message to console - asking user to enter a number */
        System.out.println("Enter a first number between (0-9)");

        /* 4.  Wait & receive user's input to console */
        int firstNumber = input.nextInt();

        /* 5.  Print message to console - asking user to enter a number */
        System.out.println("Enter a second number between (0-9)");

        /* 6.  Wait & receive user's input to console */
        int secondNumber = input.nextInt();

        /* 7.  Print message to console */
        System.out.println("The numbers you entered are (" + firstNumber + "," + secondNumber + ")");

        /* 8.  Print message to console */
        System.out.println("Program exiting - have a nice day.");
    }
}
