package firstPackage.First.src.tutorials;

public class MultipleArray {
    public static void printArrays(String[] arrOne, int[] arrTwo) {
        System.out.println("Printing string array:");
        for (String varOne : arrOne) {
            System.out.println(varOne);
        }
        System.out.println("Printing integer array:");
        for (int index : arrTwo) {
            System.out.println(index);
        }
    }

    public static void main(String[] args) {
        String[] strArr = {"apple", "banana", "orange"};
        int[] intArr = {1, 2, 3, 4};
        printArrays(strArr, intArr);
    }
}
//OUTPUT:-
// "C:\Program Files\Java\jdk-17\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\lib\idea_rt.jar=60875:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\anushrees\Desktop\Demo\DemoRepo\out\production\DemoRepo firstPackage.First.src.tutorials.MultipleArray
//Printing string array:
//apple
//banana
//orange
//Printing integer array:
//1
//2
//3
//4
//Process finished with exit code 0