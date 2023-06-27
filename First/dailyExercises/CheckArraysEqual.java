package firstPackage.First.dailyExercises;

public class CheckArraysEqual {

    public static void main(String[] args) {
        // Initializing the first array
        int array[] = {10, 30, 12};
        // Initializing the second array
        int subArray[] = {45, 50, 55, 60, 65};
        // stores the result
        boolean result = true;
        // Check if length of the two arrays are equal or not
        if (array.length == subArray.length) {
            // Loop to check elements of arrays one by one
            for (int index = 0; index < array.length; index = index + 1) {
                // To check if any element is different
                if (array[index] != subArray[index]) {
                    // If any element is different then it will assign false into boolean var
                    result = false;
                }
            }
        } else {
            // If the length of two arrays is different then it will assign false into boolean variable
            result = false;
        }
        // After completion to check whether result is true or false
        if (result == true) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }
    }
}