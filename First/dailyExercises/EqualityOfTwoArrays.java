package firstPackage.First.dailyExercises;

import java.util.Arrays;

public class EqualityOfTwoArrays {
    public static void main(String[] args) {
        int[] arrayIndex = {1, 2, 3, 4, 5};
        int[] arraySubIndex = {1, 2, 3, 4, 5};
        boolean isEqual = Arrays.equals(arrayIndex, arraySubIndex);
        if (isEqual) {
            System.out.println("Arrays are Equal.");
        } else {
            System.out.println("Arrays are Not Equal.");
        }
    }
}
//OUTPUT:
// "C:\Program Files\Java\jdk-17\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.1\lib\idea_rt.jar=64192:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\anushrees\Desktop\New folder\DemoRepo\First\out\production\First1" firstPackage.First.dailyExercises.EqualityOfTwoArrays
//Arrays are Equal.
//
//Process finished with exit code 0