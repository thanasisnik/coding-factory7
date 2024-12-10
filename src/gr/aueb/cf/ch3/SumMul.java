package gr.aueb.cf.ch3;

/**
 * Calculate the sum and mul og
 * first 10 integer
 */

public class SumMul {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        int mul = 1;
        int k = 1;

        while (i <=10)
        {
            sum += i;
            i++;
        }

        while (k <= 10)
        {
            mul = mul * i;
            k++;
        }
        System.out.println("Sum is " + sum + " Multiply is " + mul);
    }
}
