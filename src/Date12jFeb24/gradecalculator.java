package src.Date12jFeb24;

import java.util.Scanner;

public class gradecalculator {

    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter the student marks");

        int marks = s1.nextInt();

        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks entered. Marks should be between 0 and 100.");

            return; // Exiting the program if the marks are invalid

        }

       else if(marks >= 90 && marks <= 100 )
        {
            System.out.println("Student Got 'A' Grade");
        }
       else if(marks >= 80 )
        {
            System.out.println("Student Got 'B' Grade");
        }
        else if(marks >= 70 )
        {
            System.out.println("Student Got 'C' Grade");
        }
        else if(marks >= 60 )
        {
            System.out.println("Student Got 'D' Grade");
        }
        else
        {
            System.out.println("Student Got 'F' Grade");
        }
        s1.close(); // Close the Scanner
    }
}
