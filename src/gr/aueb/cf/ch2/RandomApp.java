package gr.aueb.cf.ch2;

/**
 * Random number Demo
 */

public class RandomApp {
    public static void main(String[] args) {
        int die =(int) (Math.random() * 6) + 1;
        int die1 = (int) (Math.random()*6) +1;
        System.out.printf("%d ,%d \n",die, die1);

        if (die == die1){
            System.out.println("YOU WIN");
        }
        else {
            System.out.println("YOU LOSE");
        }
    }


}
