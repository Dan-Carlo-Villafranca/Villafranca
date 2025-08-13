package airfare;

import java.util.Scanner;

public class Airfare {
public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    double ratePerKm;
    String className;
    
    System.out.print("Distance (km): ");
    int distance = sc.nextInt();
    
    System.out.print("Class: ");
    int travelClass = sc.nextInt();
    
    if (travelClass == 1) {
        ratePerKm = 250;
        className = "Economy Class";
    } else if (travelClass == 2) {
        ratePerKm = 500;
        className = "Business Class";
    } else {
        System.out.println("Invalid class selected.");
        sc.close(); 
        return;
    }

    double totalFare = distance * ratePerKm;

    if (distance > 1000) {
        totalFare = totalFare * 0.90; 
    }

    System.out.println("-------------------------");
    System.out.println("Distance(km): " + distance);
    System.out.println("Class: " + travelClass);
    System.out.println("Total Fare: " + String.format("%,.2f", totalFare));
    
    sc.close(); 
}
}