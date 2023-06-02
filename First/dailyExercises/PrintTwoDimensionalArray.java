package firstPackage.First.dailyExercises;

import java.io.IOException;

public class PrintTwoDimensionalArray {
    public static void print2D(int mockData[][]) {
        // Loop through all rows
        for (int index = 0; index < mockData.length; index++)
            // Loop through all elements of current row
            for (int subIndex = 0; subIndex < mockData[index].length; subIndex++)
                System.out.print(mockData[index][subIndex] + " ");
    }

    public static void main(String args[])
            throws IOException {
        int mockData[][] = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}};
        print2D(mockData);
    }
}