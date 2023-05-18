package firstPackage.First.dailyExercises;

public class DuplicateElements {
    public static int[] removeDuplicates(int[] input) {
        int subIndex = 0;
        int index = 1;
        //return if the array length is less than 2
        if (input.length < 2) {
            return input;
        }
        while (index < input.length) {
            if (input[index] == input[subIndex]) {
                index++;
            } else {
                input[++subIndex] = input[index++];
            }
        }
        int[] output = new int[subIndex + 1];
        for (int var = 0; var < output.length; var++) {
            output[var] = input[var];
        }
        return output;
    }

    public static void main(String a[]) {
        int[] inputElements = {2, 3, 6, 6, 8, 9, 10, 10, 10, 12, 12};
        int[] output = removeDuplicates(inputElements);
        for (int index : output) {
            System.out.print(index + " ");
        }
    }
}
//OUTPUT:
// "C:\Program Files\Java\jdk-17\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.1\lib\idea_rt.jar=55061:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\anushrees\Desktop\New folder\DemoRepo\First\out\production\First1" firstPackage.First.dailyExercises.DuplicateElements
//2 3 6 8 9 10 12
//Process finished with exit code 0