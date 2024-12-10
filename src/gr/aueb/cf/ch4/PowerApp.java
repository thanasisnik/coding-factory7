package gr.aueb.cf.ch4;

/**
 * Calculates a^n.
 */
public class PowerApp {
    public static void main(String[] args) {
        int b = 2;
        int power = 10;
        int result = 1;

        for (int i = 1; i<= 10; i++)
        {
            result = result * b;
        }

        System.out.println("Result is: " +result);
    }
}
