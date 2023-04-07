package firstPackage.First.src.MediumDifficultyAssignmnets;

import java.util.Arrays;

public class Swapper {
    private int temp;
    private int lastNumber;

    public void endSwap(int arrayOne[]) {
        // find the last value of array
        int flag = 0;
        lastNumber = arrayOne[arrayOne.length - 1];
        if (lastNumber % 2 == 0) {
            flag = flag + 1;
            System.out.println("This is not a prime number");
        } else {
            System.out.println("Array last element is : " + lastNumber + "   And the Number is prime Number");
            temp = arrayOne[0];
            arrayOne[0] = lastNumber;
            arrayOne[arrayOne.length - 1] = temp;
            System.out.println("New Array is : " + Arrays.toString(arrayOne));
        }
    }

    public static void main(String[] args) {
        Swapper swapArray = new Swapper();
        int[] arrayOne = new int[]{1, 2, 3, 7};
        swapArray.endSwap(arrayOne);
    }
}