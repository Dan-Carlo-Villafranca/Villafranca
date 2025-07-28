package activity1;

import java.util.Scanner;
public class Activity1 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sumGrades = 0;
        double aveGrade = 0;
        String remarks = "";
        
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter number of subjects: ");
        int numSub = scanner.nextInt();
        
        System.out.println("\n");
      
            for (int i = 0; i < numSub; i++) {
                System.out.print("Enter grade for sub" + (i + 1) + ": ");
                double grade = scanner.nextDouble();
                sumGrades += grade; 
            }
            
            scanner.close();
            
            if (numSub > 0) { 
                aveGrade = sumGrades / numSub;
            } else {
                aveGrade = 0; 
            }
            
            if (aveGrade > 75) {
                remarks = "PASSED";
            }
            else {
                remarks = "Fail.";
            }
            
        System.out.println("\nAverage: "+ String.format("%.2f", aveGrade));
        System.out.println("Remarks: "+remarks);

       

    }
}