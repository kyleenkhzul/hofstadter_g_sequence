package org.example;
import java.util.Scanner;

public class Hofstadter {

    public static int calculateHofstadterNumber(int n) {
        if(n == 0) {
            return 0;
        }
        return n - calculateHofstadterNumber(calculateHofstadterNumber(n-1));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What nth term in the Hofstadter G Sequence? ");
        int number = scanner.nextInt();
        scanner.close();
        int result = calculateHofstadterNumber(number);
        System.out.println("The Hofstadter G Sequence for this term is: " + result);
        
    }
}
