package src.Date12jFeb24;

import java.util.Scanner;

public class Stringreverse {

    public static void main(String[] args) {

       System.out.println("Enter the String");

        Scanner s1 = new Scanner(System.in);



        String str = s1.nextLine();
        int length = str.length()-1;
        char words;
        char word;
        boolean isPalindrome= false;


        for(int i=0; i<=length;i++)
        {
            //printing the character from left to right
            words = str.charAt(i);
            System.out.print(words);
        }

        System.out.println();
        for(int j= length;j>=0;j--)
        {
            //printing the character from right to left
            word = str.charAt(j);
            System.out.print(word);


            if (str.charAt(length - j) == word) { //it compares the front and reverse order chars)
                isPalindrome = true;
            }
        }

        // Check if the string is a palindrome
        System.out.println();
        if (isPalindrome) {
            System.out.println("The entered string is a palindrome.");
        } else {
            System.out.println("The entered string is not a palindrome.");
        }




    }
}
