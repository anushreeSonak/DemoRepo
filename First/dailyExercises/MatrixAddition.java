package firstPackage.First.dailyExercises;

public class MatrixAddition {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] subMatrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] sum = addMatrices(matrix, subMatrix);
        // Print the original matrices
        System.out.println("First Matrix is :");
        printMatrix(matrix);
        System.out.println("Second Matrix is :");
        printMatrix(subMatrix);
        // Print the sum matrix
        System.out.println("Sum of matrices:");
        printMatrix(sum);
    }

    public static int[][] addMatrices(int[][] matrix, int[][] subMatrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int[][] sum = new int[rows][columns];
        for (int index = 0; index < rows; index++) {
            for (int subIndex = 0; subIndex < columns; subIndex++) {
                sum[index][subIndex] = matrix[index][subIndex] + subMatrix[index][subIndex];
            }
        }
        return sum;
    }

    public static void printMatrix(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        for (int index = 0; index < rows; index++) {
            for (int subIndex = 0; subIndex < columns; subIndex++) {
                System.out.print(matrix[index][subIndex] + " ");
            }
            System.out.println();
        }
    }
}
//OUTPUT: "C:\Program Files\Java\jdk-17\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.1\lib\idea_rt.jar=63407:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\anushrees\Desktop\New folder\DemoRepo\First\out\production\First1" firstPackage.First.dailyExercises.MatrixAddition
//First Matrix is :
//1 2 3
//4 5 6
//7 8 9
//Second Matrix is :
//1 2 3
//4 5 6
//7 8 9
//Sum of matrices:
//2 4 6
//8 10 12
//14 16 18
//
//Process finished with exit code 0