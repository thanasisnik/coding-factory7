package gr.aueb.cf.ch8;

import java.util.Scanner;

public class NumberFormatException {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        String inputStr = "";

        try {
            System.out.println("Please insert an int");
            inputStr = in.nextLine();

            if (!isInt(inputStr)) System.out.println("Error in parsing");
            num = Integer.parseInt(inputStr);
            System.out.println(num);
        } catch (java.lang.NumberFormatException e){
            System.out.println("Input must be an int");
        }

    }

    public static boolean isInt(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch ( java.lang.NumberFormatException e){
            return false;
        }
    }
}
