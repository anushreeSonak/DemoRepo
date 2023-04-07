package firstPackage.First.src.MediumDifficultyAssignmnets;

import java.util.Arrays;

public class Swapper {
    private int temp;
    private int lastNumber;

    public void endSwap(int arrayOne[]) {

        int lastElement = arrayOne[arrayOne.length - 1];
        if (lastElement % 2 != 0) {
            int temporary = 0;
            temporary = arrayOne[0];
            arrayOne[0] = arrayOne[arrayOne.length - 1];
            arrayOne[arrayOne.length - 1] = temporary;
        }
        System.out.println(Arrays.toString(arrayOne));
    }

    public static void main(String[] args) {
        Swapper swapArray = new Swapper();
        int[] arrayOne = new int[]{1, 2, 3, 7};
        swapArray.endSwap(arrayOne);
    }
}