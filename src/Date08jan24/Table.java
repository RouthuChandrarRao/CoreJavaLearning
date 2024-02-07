package src.Date08jan24;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {

        System.out.println("Enter the table number");

        Scanner s1=new Scanner(System.in);
        int a = s1.nextInt();

        for (int i = 1; i <= 10; i++)
        {
            System.out.println(a + " X " + i + " = " + i*a);
        }
    }
}
