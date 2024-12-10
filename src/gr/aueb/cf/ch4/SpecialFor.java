package gr.aueb.cf.ch4;

/**
 * Special Types of for.
 */
public class SpecialFor {
    public static void main(String[] args) {

        for (int i = 1; i <=1; i++) {
            System.out.println("Once");
        }

        for (int i = 1, j = 10; i < j; i++,j--){
            System.out.println(i +" " + j);
        }

        for (;;){
            System.out.println("FOR EVER");
        }
    }
}
