package gr.aueb.cf.ch5;

public class PowerRecursive {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++){
            System.out.println(power(2, i));
        }
    }

    public static int power(int b, int n){

        return (n == 0) ? 1 : power( b, n-1) * b;
    }
}
