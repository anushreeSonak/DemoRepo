package firstPackage.First.mediumComplexity;

public class MatrixMultiplication {
    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int subCols = matrix2[0].length;

        int[][] result = new int[rows][subCols];

        for (int data = 0; data < rows; data++) {
            for (int mockData = 0; mockData < subCols; mockData++) {
                for (int num = 0; num < cols; num++) {
                    result[data][mockData] += matrix1[data][num] * matrix2[num][mockData];
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
        int[][] subMatrix = {{7, 8}, {9, 10}, {11, 12}};

        int[][] result = multiplyMatrices(matrix, subMatrix);

        System.out.println("First Matrix is :");
        printMatrix(matrix);
        System.out.println("Second Matrix is :");
        printMatrix(subMatrix);
        System.out.println("Result:");
        printMatrix(result);
    }

    public static void printMatrix(int[][] matrix) {
        for (int index = 0; index < matrix.length; index++) {
            for (int subIndex = 0; subIndex < matrix[0].length; subIndex++) {
                System.out.print(matrix[index][subIndex] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}