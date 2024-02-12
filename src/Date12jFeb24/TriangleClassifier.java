package src.Date12jFeb24;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TriangleClassifier {
    public static void main(String[] args) {
        System.out.println("enter the side A");
        Scanner s1 = new Scanner(System.in);
        int A = s1.nextInt();

        System.out.println("enter the side B");
        Scanner s2 = new Scanner(System.in);
        int B = s2.nextInt();

        System.out.println("enter the side C");
        Scanner s3 = new Scanner(System.in);
        int C = s3.nextInt();

        if ((A==B )&&( B==C) &&( C==A))
        {
            System.out.println("equilateral");
        }

        else if ((A == B || B ==C) || (C == A))
        {
            System.out.println("isosceles");
        }

        else
        {
            System.out.println("scalene ");
        }

        s1.close();
        s2.close();
        s3.close();
    }
}
