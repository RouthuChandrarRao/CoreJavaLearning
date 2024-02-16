package src.Date12jFeb24;

import java.util.Scanner;

public class Primenumber {

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the number");

        int num = s1.nextInt();


        // Initializing a boolean variable to track whether the number is prime or not
        boolean isPrime = true;

        // Checking for factors from 2 to num/2
        for (int i = 2; i <= num / 2; i++) {
            // If num is divisible by i, it is not a prime number
            if (num % i == 0) {
                // Setting isPrime to false and exiting the loop
                isPrime = false;
                break;
            }
        }

        // Checking the value of isPrime and printing the result
        if (isPrime) {
            // If isPrime is true, the number is prime
            System.out.println("true");
        } else {
            // If isPrime is false, the number is not prime
            System.out.println("false");
        }
    }
}
