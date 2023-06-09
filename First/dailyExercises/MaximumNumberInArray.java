package firstPackage.First.dailyExercises;

public class MaximumNumberInArray {
    public static void main(String[] args) {
        int[] arrayElement = {5, 100, 3, 8, 2};
        int maximum = findMaximum(arrayElement);
        System.out.println("The maximum number in the array is: " + maximum);
    }

    public static int findMaximum(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be empty or null");
        }

        int max = array[0];
        for (int index = 1; index < array.length; index++) {
            if (array[index] > max) {
                max = array[index];
            }
        }
        return max;
    }
}
//OUTPUT:
// "C:\Program Files\Java\jdk-17\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.1\lib\idea_rt.jar=58109:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\anushrees\Desktop\New folder\DemoRepo\First\out\production\First1" firstPackage.First.dailyExercises.MaximumNumberInArray
//The maximum number in the array is: 100
//
//Process finished with exit code 0