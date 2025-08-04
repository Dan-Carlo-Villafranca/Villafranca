
package sampleapp;

import banking.bankApp;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("WELCOME TO MY SYSTEM1");
        System.out.println("What do you feel like doing today?");
        System.out.println("1. Banking");
        System.out.println("2. Shopping");
        System.out.println("3. Pay Bills");
        
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        
        switch(choice){
            case 1:
                int attempts = 0;
                boolean loggedIn = false;

                while (attempts < 3 && !loggedIn) {
                    System.out.print("Enter Account No.: ");
                    int account = sc.nextInt();
                    System.out.print("Enter Pin No.: ");
                    int pin = sc.nextInt();

                    bankApp bapp = new bankApp();

                    if (bapp.verifyAccount(account, pin)) {
                        System.out.println("Login successful!");
                        loggedIn = true;
                    } else {
                        System.out.println("Invalid Account No. or Pin. Please try again.");
                        attempts++;
                    }
                }

                if (!loggedIn) {
                    System.out.println("Too many failed attempts. Your account has been locked.");
                }
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                System.out.println("INVALID SELECTION!");
        
        }
    }
}
