package firstPackage.First.dailyExercises;

public class EqualityOfTwoArrays {
    public static void main(String[] args) {
        int[] arrayIndex = {2, 5, 1, 7, 4};
        int[] arraySubIndex = {2, 5, 1, 7, 4};
        boolean equalOrNot = true;
        if (arrayIndex.length == arraySubIndex.length) {
            for (int index = 0; index < arrayIndex.length; index++) {
                if (arrayIndex[index] == arraySubIndex[index]) {
                    equalOrNot = true;
                } else {
                    equalOrNot = false;
                    break;
                }
            }
        } else {
            equalOrNot = false;
        }
        if (equalOrNot) {
            System.out.println("Two Arrays Are EQUAL");
        } else {
            System.out.println("Two Arrays Are Not equal");
        }
    }
}
//OUTPUT:
// "C:\Program Files\Java\jdk-17\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.1\lib\idea_rt.jar=52975:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\anushrees\Desktop\New folder\DemoRepo\First\out\production\First1" firstPackage.First.dailyExercises.EqualityOfTwoArrays
//Two Arrays Are EQUAL
//
//Process finished with exit code 0