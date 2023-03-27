
import java.util.Arrays;

public class Swapper {
    public static void main(String[] args) {
        int[] arr1 = {1, 2,3,4,5};
        int[] arr2 = {1, 2, 3};


        System.out.println(Arrays.toString(swapEnds(arr1)));
        System.out.println(Arrays.toString(swapEnds(arr2)));
    }

    public static int[] swapEnds(int[] arr) {
        int lastElement = arr[arr.length - 1];

        // Check if the last element is prime
        boolean isPrime = true;
        if (lastElement < 2) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(lastElement); i++) {
                if (lastElement % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        // Swap the first and last elements
        int temp = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;

        // Return the modified array
        if (isPrime) {
            return arr;
        } else {
            return new int[arr.length];
        }
    }
}