package firstPackage.First.dailyExercises;

public class BubbleSort {
    public static void bubbleSort(int[] array) {
        int data = array.length;
        for (int index = 0; index < data - 1; index++) {
            for (int subIndex = 0; subIndex < data - index - 1; subIndex++) {
                if (array[subIndex] > array[subIndex + 1]) {
                    // Swap arr[subIndex] and arr[subIndex+1]
                    int temp = array[subIndex];
                    array[subIndex] = array[subIndex + 1];
                    array[subIndex + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Array before sorting:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
        bubbleSort(array);
        System.out.println("Array after sorting:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}