package gr.aueb.cf.ch8;

public class InxedOutOfBoundsException {

    public static void main(String[] args) {
        int[] arr = new int[10];

        for (int i = 0; i <= arr.length; i++){
            System.out.println(arr[i] + " ");
        }
    }
}
