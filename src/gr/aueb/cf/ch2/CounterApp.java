package gr.aueb.cf.ch2;

/**
 * Count steps app, distance down by one.
 */

public class CounterApp {
    public static void main(String[] args) {
        int steps = 0;
        int distance = 3;

        System.out.printf("Steps: %d, Distance: %d\n", steps++, distance--);
        System.out.printf("Steps: %d, Distance: %d\n", steps++, distance--);
        System.out.printf("Steps: %d, Distance: %d\n", steps++, distance--);
        System.out.printf("Steps: %d, Distance: %d\n", steps++, distance--);
    }
}
