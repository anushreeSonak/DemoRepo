package firstPackage.First.src.tutorials;

public class MultipleArray {
    public static void printArrays(String[] arrOne, int[] arrTwo) {
        System.out.println("Printing string Array:");
        for (String s : arrOne) {
            System.out.println(s);
        }
        System.out.println("Printing integer Array:");
        for (int i : arrTwo) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        String[] strArr = {"Apple", "banana", "orange"};
        int[] intArr = {1, 2, 3, 4};
        // Calling the new method and passing in the arrays
        printArrays(strArr, intArr);
    }
}