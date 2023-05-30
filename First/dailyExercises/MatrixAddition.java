package firstPackage.First.dailyExercises;

public class MatrixAddition {
    public static void main(String args[]) {
        int matrix[][] = {{1, 3, 4}, {2, 4, 3}, {3, 4, 5}};
        int subMatrix[][] = {{1, 3, 4}, {2, 4, 3}, {1, 2, 4}};
        int result[][] = new int[3][3];
        for (int index = 0; index < 3; index++) {
            for (int subIndex = 0; subIndex < 3; subIndex++) {
                result[index][subIndex] = matrix[index][subIndex] + subMatrix[index][subIndex];
                System.out.print(result[index][subIndex] + " ");
            }
            System.out.println();
        }
    }
}
//OUTPUT:
// "C:\Program Files\Java\jdk-17\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.1\lib\idea_rt.jar=53865:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\anushrees\Desktop\New folder\DemoRepo\First\out\production\First1" firstPackage.First.dailyExercises.MatrixAddition
//2 6 8
//4 8 6
//4 6 9
//
//Process finished with exit code 0