package firstPackage.First.src.MediumDifficultyAssignmnets;

import java.util.Arrays;

public class Swapper {
    private int temp;
    private int lastNumber;
    boolean flag = false;

    public void endSwap(int inputArray[]) {
        lastNumber = inputArray[inputArray.length - 1];
        int mid = lastNumber / 2;
        for (int counter = 2; counter <= mid; counter++) {
            if (lastNumber % counter == 0) {
                flag = true;
                break;
            }
        }
        if (flag == true || lastNumber == 0 || lastNumber == 1) {
            System.out.println("Last number of array is : " + lastNumber + " is not prime so not swaped");
            System.out.println("new array is : " + Arrays.toString(inputArray));
        } else {
            System.out.println("Array last element is : " + lastNumber + " And Number is prime");
            temp = inputArray[0];
            inputArray[0] = lastNumber;
            inputArray[inputArray.length - 1] = temp;
            System.out.println("new array is : " + Arrays.toString(inputArray));
        }
    }

    public static void main(String[] args) {
        int[] arrayOne = new int[]{1, 2, 3, 4, 5};
        Swapper swap = new Swapper();
        swap.endSwap(arrayOne);
    }
}