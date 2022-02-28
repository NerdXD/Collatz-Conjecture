package collatzconjecture;

import java.util.Scanner;

public class CollatzConjecture {

    /*
    Basic java program... I saw a YT video about the Collatz Conjecture and found it fasinating
    so I wanted to create this to see how it works... I will link the YT video in a ReadMe
    but not rn bc I want to sleep and I will do it latr :)
     */

    public static void main(String[] args) {

        System.out.println("DONT TYPE IN 1");

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();


        while(num != 1) {
            if(num % 2 == 0) {
                num = num / 2;
            } else {
                num = (num * 3) + 1;
            }
        }

        if(num == 1) {
            System.out.println("the Collatz Conjecture has worked, final result was: " + num);
        } else {
            System.out.println("Either we broke the Collatz Conjecture or the program is broken");
        }

    }

}
