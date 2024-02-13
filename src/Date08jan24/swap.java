package src.Date08jan24;

import java.sql.SQLOutput;
import java.util.Scanner;

public class swap {

    public static void main(String[] args) {

        System.out.println("Enter a value");
        Scanner s1 = new Scanner(System.in);

        int a=s1.nextInt();
        System.out.println("Enter a value");
        Scanner s2 = new Scanner(System.in);

        int b=s2.nextInt();

      //  int temp =a;

        //a=b;

        //b=temp;

        a= a+b;
        b= a-b;
        a=a-b;

        System.out.println("A is = "+a+" B is = "+b);








    }
}
