package firstPackage.First.dailyExercises;

public class LargestNum {
    public static void main(String[] args) {
        int numFirst = 10;
        int numSecond = 250;
        int numThird = 30;
        int largest = numFirst;
        if (numSecond > largest) {
            largest = numSecond;
        }
        if (numThird > largest) {
            largest = numThird;
        }
        System.out.println("The largest number is: " + largest);
    }
}
//OUTPUT:
// "C:\Program Files\Java\jdk-17\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.1\lib\idea_rt.jar=61575:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\anushrees\Desktop\New folder\DemoRepo\First\out\production\First1" firstPackage.First.dailyExercises.LargestNum
//The largest number is: 250
//Process finished with exit code 0