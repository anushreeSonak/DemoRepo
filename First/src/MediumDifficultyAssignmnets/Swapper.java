package firstPackage.First.src.MediumDifficultyAssignmnets;

import java.util.Arrays;

public class Swapper {
    private int temp;
    private int lastElement;

    public void endSwap(int arrayOne[]) {
        lastElement = arrayOne[arrayOne.length - 1];
        int i, Num = 0, flag = 0;
        Num = lastElement / 2;
        if (lastElement == 0 || lastElement == 1) {
            System.out.println(lastElement + " is not Prime Number" +
                    "  The array is :" + Arrays.toString(arrayOne));
        } else {
            for (i = 2; i <= Num; i++) {
                if (lastElement % i == 0) {
                    System.out.println(lastElement + " is not a Prime Number" +
                            "The array is :" + Arrays.toString(arrayOne));
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(lastElement + " is a Prime Number");
                temp = arrayOne[0];
                arrayOne[0] = lastElement;
                arrayOne[arrayOne.length - 1] = temp;
                System.out.println("Updated New array is : " + Arrays.toString(arrayOne));
            }
        }
    }

    public static void main(String[] args) {
        Swapper swapArray = new Swapper();
        int[] arrayOne = new int[]{1, 2, 3, 7};
        swapArray.endSwap(arrayOne);
    }
}