package firstPackage.First.dailyExercises;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        //declare an array and print the original contents
        int[] numArray = {10, 6, 15, 4, 1, 45};
        System.out.println("Original Array:" + Arrays.toString(numArray));
        //apply insertion sort algorithm on the array
        for (int index = 1; index < numArray.length - 1; index++) {
            int temp = numArray[index];
            int insertionArray = index - 1;
            while (insertionArray >= 0 && temp <= numArray[insertionArray]) {
                numArray[insertionArray + 1] = numArray[insertionArray];
                insertionArray = insertionArray - 1;
            }
            numArray[insertionArray + 1] = temp;
        }
        //print the sorted array
        System.out.println("Sorted Array is :" + Arrays.toString(numArray));
    }
}
//OUTPUT:"C:\Program Files\Java\jdk-17\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.1\lib\idea_rt.jar=64381:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\anushrees\Desktop\New folder\DemoRepo\First\out\production\First1" firstPackage.First.dailyExercises.InsertionSort
//Original Array:[10, 6, 15, 4, 1, 45]
//Sorted Array is :[1, 4, 6, 10, 15, 45]
//Process finished with exit code 0