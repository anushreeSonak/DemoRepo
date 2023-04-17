package firstPackage.First.src.tutorials;

public class MultipleArray {
    public static void printArrays(String[] stringArray, int[] fruitArray) {
        System.out.println("Printing string array:");
        for (String var : stringArray) {
            System.out.println(var);
        }
        System.out.println("Printing integer array:");
        for (int index : fruitArray) {
            System.out.println(index);
        }
    }

    public static void main(String[] args) {
        String[] stringSetArray = {"apple", "banana", "orange"};
        int[] numericArray = {1, 2, 3, 4};
        printArrays(stringSetArray, numericArray);
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