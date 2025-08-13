/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sampleapp;

import java.util.Scanner;

/**
 *
 * @author PC3
 */
public class Act2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Enter Employee name: ");
        String name = sc.nextLine();
        System.out.print("Enter hourly rate: ");
        float hrate = sc.nextFloat();
        System.out.print("Enter total hours worked this week: ");
        float hrs = sc.nextFloat();
        
        System.out.println("-------- Wage Summary --------");
        System.out.println("Employee: "+name);
        System.out.println("Hourly rate: "+hrate);
        System.out.println("Hours worked: "+hrs);
        System.out.println("Gross Weekly Wage: "+(hrs*hrate));
        System.out.println("SSS Contributions(10%%): "+ (hrs*hrate)*0.1);
        System.out.println("------------------------------");
        System.out.println("Net Weekly Wage: "+((hrs*hrate)-((hrs*hrate)*0.10)));
        
    }
}
