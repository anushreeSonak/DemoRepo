package firstPackage.First.src.MediumDifficultyAssignmnets;

import java.util.Arrays;

public class Swapper {
    public void CheckPrimeNum(int[] intArray) {
        int temp = 0;
        int lastNum = intArray[intArray.length - 1];
        if (lastNum % 2 == 0) {
            System.out.println("The last number of array is not prime number: " + lastNum);
        } else {
            temp = intArray[0];
            intArray[0] = intArray[intArray.length - 1];
            intArray[intArray.length - 1] = temp;
            System.out.println("The last number of array is  prime number: " + lastNum);
            System.out.println("The swap array is: " + Arrays.toString(intArray));
        }
    }

    public static void main(String[] args) {
        Swapper primeNumber = new Swapper();
        int[] Array = new int[]{1, 2, 3, 7};
        int[] ArrayOne = new int[]{1, 2, 3, 4, 12};
        int[] ArrayTwo = new int[]{1, 6, 7, 9, 8};
        primeNumber.CheckPrimeNum(Array);
        primeNumber.CheckPrimeNum(ArrayOne);
        primeNumber.CheckPrimeNum(ArrayTwo);
    }
}