package src.Date12jFeb24;

import java.util.Scanner;

public class Leafyear {
    public static void main(String[] args) {
        System.out.println("Enter the year");
        Scanner s1 = new Scanner(System.in);
        int year = s1.nextInt();

        if((year %4 ==0 || year %100 != 0) && (year %400 ==0))
        {
            System.out.println(year + "Is leaf year");
        }
        else
        {
            System.out.println(year + " not a leaf year");
        }
    }
}
