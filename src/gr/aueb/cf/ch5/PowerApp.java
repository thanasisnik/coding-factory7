package gr.aueb.cf.ch5;

/**
 * Calculates a^n.
 */
public class PowerApp {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++){
            System.out.println(i + " ^ " + i + " = " + pow(i, i));
        }

    }

    /**
     * Calculates a^n.
     * Delegation / Forwarding.
     *
     * @param a     the base.
     * @param n     the power.
     * @return      the base raised to the power.
     */
    public static long pow(long a, long n){
//        long result = 1;
//
//        for (int i = 1; i <= n; i++){
//            result *= a;
//        }
//
//        return result;
        return (long) Math.pow(a, n);
    }
}
