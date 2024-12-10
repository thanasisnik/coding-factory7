package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * reverse the input integer number
 * ex input 123 output 321.
 */

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = 0;
        int reversed = 0;
        int tempNum = 0;
        int rightDigit = 0;


        System.out.println("Enter a positive integer:");
        inputNum = scanner.nextInt();
        tempNum = inputNum;


        while ( tempNum > 0){
            rightDigit = tempNum % 10;
            reversed = reversed * 10 + rightDigit; //every time
            tempNum /= 10;

        }
        System.out.println("The reversed number is: " +reversed);
    }
}
