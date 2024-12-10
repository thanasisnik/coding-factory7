package gr.aueb.cf.ch6;

/**
 * Finds the min and max of an array.
 */
public class ArrayMinMax {
    public static void main(String[] args) {
        

    }

    public static int getMinPosition(int[] arr){
        if (arr == null || arr.length < 1) return -1;

        int minPosition = 0;
        int min = arr[minPosition];
        for ( int i = 0; i < arr.length; i++){
            if (arr[i] < min){
                minPosition = i;
                min = arr[i];
            }
        }
        return minPosition;
    }

    public static int getMaxPosition(int[] arr){
        if (arr == null || arr.length < 1) return -1;

        int maxPosition = 0;
        int max = arr[maxPosition];
        for ( int i = 0; i < arr.length; i++){
            if (arr[i] > max){
                maxPosition = i;
                max = arr[i];
            }
        }
        return maxPosition;
    }

}
