package src.Date12jFeb24;


import java.util.Scanner;

public class Stringreverse {

    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter the input");

        String input = s1.nextLine();

        int length = input.length()-1;

      input= input.toLowerCase();

        char letter;
        char letters;

        boolean stringreverse = true;

        for (int i =0; i < length; i++)
        {
            letter = input.charAt(i);

        }

        for (int j = length ; j >= 0; j--)
        {
            letters = input.charAt(j);

            if (input.charAt(length - j)  == letters)
            {
                stringreverse = false;

                break;
            }
            System.out.println();
        }

        if(stringreverse)
        {
            System.out.println("false");
        }
        else {
            System.out.println("true");
        }







    }
}
