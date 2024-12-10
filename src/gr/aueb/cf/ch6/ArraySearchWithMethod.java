package gr.aueb.cf.ch6;

/**
 * Array Search with Method.
 */
public class ArraySearchWithMethod {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int position;

        position = getPosition(arr, 5);

        if (position == -1){
            System.out.println("The element doesn't found.");
        } else {
            System.out.println("Value: " + arr[position] + " Position: " +(position +1));
        }
    }

    public static int getPosition(int[] arr, int value){
        int positionToReturn = -1;

        for ( int i = 0; i < arr.length; i++){
            if (arr[i] == value){
                positionToReturn = i;
                break;
            }
        }
        return positionToReturn;
    }
}
