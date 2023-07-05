package firstPackage.First.dailyExercises;

import java.util.Arrays;

public class ArrayCompare {
    public static <T> boolean compareArrays(T[] array, T[] subArray) {
        if (array.length != subArray.length) {
            return false;
        }

        for (int index = 0; index < array.length; index++) {
            if (!array[index].equals(subArray[index])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Integer[] arrayFirst = {
                1,
                2,
                3,
                4
        };
        Integer[] arrSecond = {
                1,
                2,
                4,
                4
        };
        Integer[] arrThird = {
                1,
                2,
                3,
                4
        };
        String[] arrFourth = {
                "Java",
                "World"
        };
        String[] arrFifth = {
                "JavaScript",
                "World"
        };
        String[] arrSixth = {
                "Java",
                "World"
        };
        System.out.println("Original arrays:");
        System.out.println("First Array: " + Arrays.toString(arrayFirst));
        System.out.println("Second Array: " + Arrays.toString(arrSecond));
        System.out.println("Third Array: " + Arrays.toString(arrThird));
        System.out.println("Fourth Array: " + Arrays.toString(arrFourth));
        System.out.println("Fifth Array: " + Arrays.toString(arrFifth));
        System.out.println("Sixth Array: " + Arrays.toString(arrSixth));
        System.out.println("\nCompare First Array and Second Array: " + compareArrays(arrayFirst, arrSecond)); //false
        System.out.println("Compare First Array and Third Array: " + compareArrays(arrayFirst, arrThird)); //true
        System.out.println("Compare Fourth Array and Fifth Array : " + compareArrays(arrFourth, arrFifth)); //false
        System.out.println("Compare Fourth Array and Sixth Array: " + compareArrays(arrFourth, arrSixth)); //true
    }
}