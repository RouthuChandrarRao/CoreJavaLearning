package src.Date12jFeb24;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        System.out.println("Enter the String");

        Scanner s1 = new Scanner(System.in);

        String str = s1.nextLine();
        int length = str.length() - 1;
        char words;
        char word;
        boolean isPalindrome = true; // Initialize to true

        System.out.println("Original String: " + str);

        // Print characters from left to right
        for (int i = 0; i <= length; i++) {
            words = str.charAt(i);
            System.out.print(words);
        }

        System.out.println();

        // Print characters from right to left and check for palindrome
        for (int j = length; j >= 0; j--) {
            word = str.charAt(j);
            System.out.print(word);

            if (str.charAt(length - j) != word) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println();

        // Check if the string is a palindrome
        if (isPalindrome) {
            System.out.println("The entered string is a palindrome.");
        } else {
            System.out.println("The entered string is not a palindrome.");
        }

    }
}
