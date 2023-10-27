package org.homescreen;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FileManager.readTransactionsFile();


        boolean done = false;
        while (!done) {
            System.out.println();
            System.out.println("""
                    ....................................
                    :                                  :
                    :            LEGER APP             :
                                                      
                                Hello, Evie             
                                                       
                    :    What would you like to do?    :
                    :                                  :
                             1. Add A Deposit         
                             2. Make A Payment         
                    :        3. See Ledger             :
                    :        4. Exit                   :
                    :..................................:
                     """);

            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Okay, let's add a deposit.");
                    addDeposit();
                    break;
                case 2:
                    System.out.println("Okay, let's ake a payment.");
                    makePayment();
                    break;
                case 3:
                    System.out.println("Okay, let's go to the Leger screen.");
                    displayLedgerScreen();
                    break;
                case 4:
                    System.out.println("Good Bye.");
                    System.exit(0);
                    break;


            }
        }
    }

    private static void displayLedgerScreen() {

        boolean done = false;
        while (!done) {
            System.out.println();

            System.out.println("""
                    ............................
                          LEGER SCREEN
                    ............................
                    """);


            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();


        }
    }

    private static void makePayment() {
        System.out.println("How much would you like to pay?");
        Scanner scanner = new Scanner(System.in);
        double amount = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Please specify a vendor.");
        String vendor = scanner.nextLine();
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();

        // Why is this code block skipped?
        System.out.println("""
                -------------------------------------------- 
                       Your payment has been applied.      
                   Press Enter to return to the main menu.                                          
                """);


    }

    private static void addDeposit() {
        System.out.println("How much would you like to add?");
        Scanner scanner = new Scanner(System.in);
        // Read numeric input and then clear the new line.
        double amount = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Where would you like to make your deposit?");
        String vendor = scanner.nextLine();
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        System.out.println("To which account?");
        String description = scanner.nextLine();
        // Not able to see the message printed bellow in console
        System.out.println();
        System.out.println("""
                    Your deposit has been added.
                Press Enter to return to the main menu.""");
        System.out.println();
        // Todo fix this
        Transaction t = new Transaction(date, time, description, vendor, amount);
        System.out.println(t);


    }

}
