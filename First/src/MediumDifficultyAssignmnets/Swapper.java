package firstPackage.First.src.MediumDifficultyAssignmnets;

import java.util.Arrays;

public class Swapper {
    public static void main(String[] args) {
        Swapper swapObject = new Swapper();
        int[] inputArray = {1, 2, 3, 7};
        int[] inputArraySecond = {1, 2, 3};
        int[] inputArrayThird = {1, 6, 7, 9, 8, 12};
        swapObject.swapPrimeNumber(inputArray);
        swapObject.swapPrimeNumber(inputArraySecond);
        swapObject.swapPrimeNumber(inputArrayThird);
    }

    public void swapPrimeNumber(int[] inputArray) {
        int lastElement = inputArray[inputArray.length - 1];
        if (lastElement % 2 != 0) {
            int temporary = 0;
            temporary = inputArray[0];
            inputArray[0] = inputArray[inputArray.length - 1];
            inputArray[inputArray.length - 1] = temporary;
        }
        System.out.println(Arrays.toString(inputArray));
    }
}